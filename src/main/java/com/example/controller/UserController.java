package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.util.RedisService;

@RestController
public class UserController{
	
	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	@GetMapping("/find")
	public String findAll(){
		redisTemplate.convertAndSend("test", "测试信息");
		return "SUCCESS";
	}
}
