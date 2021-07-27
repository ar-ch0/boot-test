package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.Test;

@Service("Test2Impl")
public class Test2Impl implements Test {

	@Override
	public void test() {
		System.out.println("test2");
	}

}
