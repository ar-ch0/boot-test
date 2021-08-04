package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Host2;
import com.example.demo.domain.Target2;
import com.example.demo.repository.Host2Repository;
import com.example.demo.repository.Target2Repository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HostTargetService2 {

	private final Target2Repository targetRepo;
	private final Host2Repository hostRepo;

	public void save() {
		Target2 target = Target2.builder().name("target2").build();
		Host2 host = Host2.builder().name("host2").target(target).build();

		targetRepo.save(target);
		hostRepo.save(host);
	}

	public Target2 read1() {

		return targetRepo.findById(1L).get();
	}

	public Host2 read2() {
		return hostRepo.findById(1L).get();
	}
}
