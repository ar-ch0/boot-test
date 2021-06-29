package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.impl.KafkaProducer;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/kafka")
@Api
public class KafkaController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private final KafkaProducer producer;

	@Autowired
	KafkaController(KafkaProducer producer) {
		this.producer = producer;
	}

	@PostMapping
	public String sendMessage(@RequestParam("message") String message) {
		this.producer.sendMessage(message);
		return  "success";
	}
}
