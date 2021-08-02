package com.example.demo.service;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@KafkaListener(topics = "exam", groupId = "foo")
	public void consume(String message) throws IOException {
		System.out.println(String.format("Consumed message : %s", message));
	}
}
