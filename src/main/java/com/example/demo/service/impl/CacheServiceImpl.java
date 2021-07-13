package com.example.demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.service.CacheService;

@Service
public class CacheServiceImpl implements CacheService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Cacheable(value = "test")
	@Override
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

	@Override
	@CacheEvict(value = "test")
	public User testRefresh(User user) {
		logger.info("cache clear");
		return user;
	}
}
