package com.example.demo.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Child1;
import com.example.demo.domain.Child2;
import com.example.demo.domain.Parent1;
import com.example.demo.domain.Parent2;
import com.example.demo.repository.Child2Repository;
import com.example.demo.repository.Parent2Repository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ParentChildService2 {
	private final Parent2Repository parentRepo;
	private final Child2Repository childRepo;

	public void save() {
		Child2 child1 = Child2.builder().name("child1").build();
		Child2 child2 = Child2.builder().name("child2").build();

		Parent2 parent = Parent2.builder().name("parent1").childList(Arrays.asList(child1, child2)).build();
		childRepo.save(child1);
		childRepo.save(child2);
		parentRepo.save(parent);
	}

	public Parent2 readParent() {
		Parent2 parent = parentRepo.findById(1L).get();
		return parent;
	}

	public Child2 readChild() {
		Child2 child = childRepo.findById(1L).get();
		return child;

	}
}
