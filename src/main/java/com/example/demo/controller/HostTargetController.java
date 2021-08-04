package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Host1;
import com.example.demo.domain.Host2;
import com.example.demo.domain.Target1;
import com.example.demo.domain.Target2;
import com.example.demo.service.HostTargetService1;
import com.example.demo.service.HostTargetService2;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@Api
@RestController
@RequestMapping("/host-target")
@RequiredArgsConstructor
public class HostTargetController {
	private final HostTargetService1 hostTargetService1;
	private final HostTargetService2 hostTargetService2;

	@GetMapping("/save1")
	public void save1() {
		hostTargetService1.save();
	}

	@GetMapping("/read-host1")
	public Host1 readparent1() {
		return hostTargetService1.read2();
	}

	@GetMapping("/read-target1")
	public Target1 readchild1() {
		return hostTargetService1.read1();
	}

	@GetMapping("/save2")
	public void save2() {
		hostTargetService2.save();
	}

	@GetMapping("/read-host2")
	public Host2 readparent2() {
		return hostTargetService2.read2();
	}

	@GetMapping("/read-target2")
	public Target2 readchild2() {
		return hostTargetService2.read1();
	}
}
