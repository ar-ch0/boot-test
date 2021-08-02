package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.service.Test;

@Service("Test1Impl")
public class Test1 implements Test{
	
	@Override
	public void test() {
		System.out.println("test1");
		
	}

}
