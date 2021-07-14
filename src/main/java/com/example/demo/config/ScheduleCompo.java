package com.example.demo.config;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleCompo {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Scheduled(fixedDelay = 2000)
	public void task1() {
		logger.info("The current date (1) : " + LocalDateTime.now());
	}

	@Scheduled(fixedDelayString = "${spring.task.fixedDelay}")
	public void task2() {
		logger.info("The current date (2) : " + LocalDateTime.now());
	}
}
