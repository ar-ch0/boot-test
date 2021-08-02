package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.config.MailHandler;
import com.example.demo.domain.MailDto;

@Service
public class MailService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private JavaMailSender mailSender;

	@Value("${data.from.address}")
	private String FROM_ADDRESS;

	public void mailSend(MailDto mailDto) {
		System.out.println(FROM_ADDRESS);

		try {
			MailHandler mailHandler = new MailHandler(mailSender);
			mailHandler.setTo(mailDto.getAddress());
			mailHandler.setFrom(FROM_ADDRESS);
			mailHandler.setSubject(mailDto.getTitle());
// <img src='cid:sample-img'>
			String htmlContent = "<p>" + mailDto.getMessage() + "<p>";

			mailHandler.setText(htmlContent, true);

			System.out.println(mailHandler);
			mailHandler.send();

		} catch (Exception e) {
			logger.error(e.toString());
		}

	}
}
