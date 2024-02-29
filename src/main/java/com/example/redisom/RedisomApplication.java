package com.example.redisom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.redis.om.spring.annotations.EnableRedisDocumentRepositories;

@EnableRedisDocumentRepositories()
@SpringBootApplication
public class RedisomApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisomApplication.class, args);
	}

}
