package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.service.Test;

@Service("Test2Impl")
public class Test2 implements Test {

	@Override
	public void test() {
		System.out.println("test2");
	}

}
