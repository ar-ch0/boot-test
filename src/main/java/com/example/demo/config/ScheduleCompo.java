package com.example.demo.config;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleCompo {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	// fixedDelay 이전 작업이 종료된 후 설정시간 이후에 다시 시작 ms 기준
	// fixedDelayString fixedDelay와 동일, String 으로 입력
	// fixedRate 설정된 시간마다 시작. (이전 작업과 무관)
	// fixedRateString 위와 동일, String으로 입력
	// initialDelay 프로그램이 시작하자마자 작업하는게 아닌 시작을 설정된 시간만큼 지연하여 작동을 시작한다.
	// @Scheduled(fixedRate = 5000, initailDelay = 3000)
	// 3초후 부터 5초 간격으로 작업
	// initialDelayString 위와 동일, String 으로 입력
	// cron @Scheduled(cron = " * * * * * * " )
	// 첫번째 부터 초 분 시간 일 월 요일
	// zone @Scheduled(cron = " 0 0 14 * * *" , zone = "Asia/Seoul")
	// 미설정시 local 시간대를 사용한다.

	//@Scheduled(fixedDelay = 30000)
	public void task1() {
		logger.info("The current date (1) : " + LocalDateTime.now());
		try {
			logger.info("The current date (1) sleep : " + LocalDateTime.now());
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			logger.error(e.toString());
		}
	}

//	@Scheduled(fixedDelayString = "${spring.task.fixedDelay}")
	public void task2() {
		logger.info("The current date (2) : " + LocalDateTime.now());
		try {
			logger.info("The current date (2) sleep : " + LocalDateTime.now());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			logger.error(e.toString());
		}
	}

//	@Scheduled(fixedRate = 10000)
	public void task3() {
		logger.info("The current date (3) : " + LocalDateTime.now());
		try {
			logger.info("The current date (3) sleep : " + LocalDateTime.now());
			Thread.sleep(1000);

			logger.info("The current date (3) sleep : " + LocalDateTime.now());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			logger.error(e.toString());
		}
	}
}
