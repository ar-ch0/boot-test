package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.MailDto;
import com.example.demo.service.MailService;

import io.swagger.annotations.Api;

@Api
@RestController
@RequestMapping("/mail")
public class MailController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private MailService mailService;

	@GetMapping("/mail")
	public String dispMail() {
		return "mail";
	}

	@PostMapping("/mail")
	public void execMail(@RequestBody MailDto mailDto) {
		
		logger.info(mailDto.toString());
		
		mailService.mailSend(mailDto);
	}

}
