package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;

@Service
public class CacheService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Cacheable(value = "test")
	public User test(User user) {

		Long time = 3000L;
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			logger.info(e.toString());
		}

		logger.info(user.toString());

		return user;

	}

	@CacheEvict(value = "test")
	public User testRefresh(User user) {
		logger.info("cache clear");
		return user;
	}
}
