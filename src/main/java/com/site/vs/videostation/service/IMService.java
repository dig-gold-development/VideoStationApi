package com.site.vs.videostation.service;


import com.site.vs.videostation.pojo.ConfirmSessionRequest;
import com.site.vs.videostation.pojo.CreateSessionRequest;
import com.site.vs.videostation.pojo.RestResult;

public interface IMService {
    RestResult sendCode(String mobile);
    RestResult login(String mobile, String code, String clientId);


    RestResult createPcSession(CreateSessionRequest request);
    RestResult loginWithSession(String token);

    RestResult scanPc(String token);
    RestResult confirmPc(ConfirmSessionRequest request);
}
