package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.service.CacheService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/cache")
@Api
public class CacheController {

	// 들어오는 parameter 값이 동일할때 evict 가능. (객체든, 일반 String이든)

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CacheService cacheService;

	@PostMapping("/test")
	public void test(@RequestBody User user) {
		logger.info("Starting cache Test");
		User testUser = cacheService.test(user);
		logger.info(testUser.toString());
		logger.info("End Test");
	}

	@PostMapping("/test2")
	public void test2(@RequestBody User user) {
		logger.info("Starting cache Refresh");
		User testUser = cacheService.testRefresh(user);
		logger.info(testUser.toString());
		logger.info("End Cache Refresh");
	}
}
