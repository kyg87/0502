package com.newlecture.web.service;

import java.io.IOException;

import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/resource/chatserver")
public class ChatServerEndPoint {
	
	@OnOpen
	public void onOpen(Session session, EndpointConfig config){
		System.out.println("클라이언트가 접속 되었습니다.");
	}
	
	@OnMessage
	public void onTextMessage(Session session, String data) throws IOException{
		
		System.out.println(data);
		
		session.getBasicRemote().sendText(data);
	}
	
	@OnClose
	public void onClose(Session session){
		System.out.println("클라이언트 접속 해제");
	}

}
