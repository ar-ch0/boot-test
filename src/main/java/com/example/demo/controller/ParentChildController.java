package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Child1;
import com.example.demo.domain.Child2;
import com.example.demo.domain.Child3;
import com.example.demo.domain.Parent1;
import com.example.demo.domain.Parent2;
import com.example.demo.domain.Parent3;
import com.example.demo.service.ParentChildService1;
import com.example.demo.service.ParentChildService2;
import com.example.demo.service.ParentChildService3;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@Api
@RestController
@RequestMapping("/parent-child")
@RequiredArgsConstructor
public class ParentChildController {
	private final ParentChildService1 pcService1;
	private final ParentChildService2 pcService2;
	private final ParentChildService3 pcService3;

	@GetMapping("/save")
	public void save() {
		pcService1.save();
	}

	@GetMapping("/read-parent")
	public Parent1 readparent1() {
		return pcService1.readParent();
	}

	@GetMapping("/read-child")
	public Child1 readchild1() {
		return pcService1.readChild();
	}

	@GetMapping("/save2")
	public void save2() {
		pcService2.save();
	}

	@GetMapping("/read-parent2")
	public Parent2 readparent2() {
		return pcService2.readParent();
	}

	@GetMapping("/read-child2")
	public Child2 readchild2() {
		return pcService2.readChild();
	}

	@GetMapping("/save3")
	public void save3() {
		pcService3.save();
	}

	@GetMapping("/read-parent3")
	public Parent3 readparent3() {
		return pcService3.readParent();
	}

	@GetMapping("/read-child3")
	public Child3 readchild3() {
		return pcService3.readChild();
	}

}
