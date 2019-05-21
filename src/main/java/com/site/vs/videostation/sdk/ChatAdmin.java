package com.site.vs.videostation.sdk;


import com.site.vs.videostation.sdk.model.*;
import com.site.vs.videostation.sdk.model.pojos.Conversation;
import com.site.vs.videostation.sdk.model.pojos.MessagePayload;
import com.site.vs.videostation.sdk.model.pojos.SendMessageData;

public class ChatAdmin {
    public static void init(String url, String secret) {
        HttpUtils.init(url, secret);
    }

    public static IMResult<User> getUserByName(String mobile) throws Exception {
        String path = "/admin/user/info";
        UserName name = new UserName(mobile);
        return HttpUtils.httpJsonPost(path, name, User.class);
    }

    public static IMResult<UserId> createUser(User user) throws Exception {
        String path = "/admin/user/create";
        return HttpUtils.httpJsonPost(path, user, UserId.class);
    }

    public static IMResult<Token> getUserToken(String userId, String clientId) throws Exception {
        String path = "/admin/user/token";
        return HttpUtils.httpJsonPost(path, new GetTokenRequest(userId, clientId), Token.class);
    }

    public static IMResult<SendMessageResult> sendMessage(String sender, Conversation conversation, MessagePayload messagePayload) throws Exception {
        String path = "/admin/message/send";
        SendMessageData sendMessageData = new SendMessageData();
        sendMessageData.setSender(sender);
        sendMessageData.setConv(conversation);
        sendMessageData.setPayload(messagePayload);
        return HttpUtils.httpJsonPost(path, sendMessageData, SendMessageResult.class);
    }

    public static void main(String[] args) {
        ChatAdmin.init("http://localhost:18080", "123456");
        Conversation conv = new Conversation();
        conv.setLine(0);
        conv.setTarget("chatroom1");
        conv.setType(2);
        MessagePayload payload = new MessagePayload();
        payload.setType(1);
        payload.setSearchableContent("hello world");
        try {
            IMResult<SendMessageResult> result = ChatAdmin.sendMessage("FHFQFQ00", conv, payload);
            if (result != null) {
                System.out.println("send message with message uid " + result.getResult().getMessageUid());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
