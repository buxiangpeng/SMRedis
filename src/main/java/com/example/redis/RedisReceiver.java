package com.example.redis;

import org.springframework.stereotype.Component;

@Component 
public class RedisReceiver {
	
	/**接收消息的方法*/  
    public void receiveMessage(String message){  
        System.out.println(message);  
    }  

}
