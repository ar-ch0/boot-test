package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.slave.domain.Slave;
import com.example.demo.slave.repository.SlaveRepository;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@Api
@RestController
@RequestMapping("/multi")
@RequiredArgsConstructor
public class MultipleDBController {

	private final SlaveRepository slaveRepository;

	@PostMapping("/save")
	public void save() {
		Slave slave = new Slave();

		slave.setName("test");

		slaveRepository.save(slave);

	}

	@PostMapping("/read")
	public void read() {
		slaveRepository.findById(1L);

	}
}
