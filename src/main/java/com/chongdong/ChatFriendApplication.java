package com.chongdong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chongdong.mapper")
public class ChatFriendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatFriendApplication.class, args);
	}

}
