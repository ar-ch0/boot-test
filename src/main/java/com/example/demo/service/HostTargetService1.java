package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Host1;
import com.example.demo.domain.Target1;
import com.example.demo.repository.Host1Repository;
import com.example.demo.repository.Target1Repository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HostTargetService1 {

	private final Target1Repository targetRepo;
	private final Host1Repository hostRepo;

	public void save() {
		Target1 target = Target1.builder().name("target1").build();
		Host1 host = Host1.builder().name("host1").target(target).build();

		targetRepo.save(target);
		hostRepo.save(host);
	}

	public Target1 read1() {

		return targetRepo.findById(1L).get();
	}

	public Host1 read2() {
		return hostRepo.findById(1L).get();
	}
}
