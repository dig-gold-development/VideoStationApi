package com.site.vs.videostation.service;


import com.site.vs.videostation.dao.VideoUserDao;
import com.site.vs.videostation.entity.CodeMsg;
import com.site.vs.videostation.entity.VideoUser;
import com.site.vs.videostation.exception.GlobalException;
import com.site.vs.videostation.redis.RedisService;
import com.site.vs.videostation.redis.VideoUserKey;
import com.site.vs.videostation.until.MD5Util;
import com.site.vs.videostation.until.UUIDUtil;
import com.site.vs.videostation.vo.LoginVo;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Service
public class MiaoshaUserService {
	
	
	public static final String COOKI_NAME_TOKEN = "token";
	
	@Autowired
	VideoUserDao videoUserDao;
	
	@Autowired
	RedisService redisService;
	
	public VideoUser getById(long name) {
		//取缓存
		VideoUser user = redisService.get(VideoUserKey.getById, ""+name, VideoUser.class);
		if(user != null) {
			return user;
		}
		//取数据库
		user = videoUserDao.getById(name);
		if(user != null) {
			redisService.set(VideoUserKey.getById, ""+name, user);
		}
		return user;
	}


	public VideoUser getByToken(HttpServletResponse response, String token) {
		if(StringUtils.isEmpty(token)) {
			return null;
		}
		VideoUser user = redisService.get(VideoUserKey.token, token, VideoUser.class);
		//延长有效期
		if(user != null) {
			addCookie(response, token, user);
		}
		return user;
	}
	

	public String login(HttpServletResponse response, LoginVo loginVo) {
		if(loginVo == null) {
			throw new GlobalException(CodeMsg.SERVER_ERROR);
		}
		String name = loginVo.getName();
		String formPass = loginVo.getPassword();
		//判断手机号是否存在
		VideoUser user = getById(Long.parseLong(name));
		if(user == null) {
			throw new GlobalException(CodeMsg.MOBILE_NOT_EXIST);
		}
		//验证密码
		String dbPass = user.getPassword();
		String saltDB = user.getSalt();
		String calcPass = MD5Util.formPassToDBPass(formPass, saltDB);
		System.out.print("====name"+name+"-----calcPass"+calcPass);
		if(!calcPass.equals(dbPass)) {
			throw new GlobalException(CodeMsg.PASSWORD_ERROR);
		}
		//生成cookie
		String token	 = UUIDUtil.uuid();
		addCookie(response, token, user);
		return token;
	}
	
	private void addCookie(HttpServletResponse response, String token, VideoUser user) {
		redisService.set(VideoUserKey.token, token, user);
		Cookie cookie = new Cookie(COOKI_NAME_TOKEN, token);
		cookie.setMaxAge(VideoUserKey.token.expireSeconds());
		cookie.setPath("/");
		response.addCookie(cookie);
	}

}
