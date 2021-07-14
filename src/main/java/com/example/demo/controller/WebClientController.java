package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import io.swagger.annotations.Api;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/web-client")
@Api
public class WebClientController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/test1")
	public String test1() throws InterruptedException {
		Thread.sleep(5000L);
		return "test1";
	}

	@GetMapping("/test2")
	public String test2() throws InterruptedException {
		Thread.sleep(3000L);
		return "test2";
	}

	@GetMapping("/start")
	public void start() {
		logger.info("Starting WebClient Test");

		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		WebClient webClient = WebClient.builder().build();

		Mono<String> test1 = webClient.get().uri("http://localhost:9443/web-client/test1").retrieve()
				.bodyToMono(String.class);

		test1.subscribe(s -> {
			logger.info("return!! test1");
			logger.info(s);
			if (stopWatch.isRunning()) {
				stopWatch.stop();
			}
			logger.info(stopWatch.prettyPrint());
			stopWatch.start();
		});

		Mono<String> test2 = webClient.get().uri("http://localhost:9443/web-client/test2").retrieve()
				.bodyToMono(String.class);

		test2.subscribe(s -> {
			logger.info("return!! test2");
			logger.info(s);
			if (stopWatch.isRunning()) {
				stopWatch.stop();
			}
			logger.info(stopWatch.prettyPrint());
			stopWatch.start();
		});

		logger.info("Checking WebClient Test");
		logger.info("this line is endpoint of Start method");
	}

}
