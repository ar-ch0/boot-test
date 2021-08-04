package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Child1;
import com.example.demo.domain.Parent1;
import com.example.demo.repository.Child1Repository;
import com.example.demo.repository.Parent1Repository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ParentChildService1 {
	private final Parent1Repository parentRepo;
	private final Child1Repository childRepo;

	public void save() {
		Parent1 parent = Parent1.builder().name("parent1").build();
		Child1 child1 = Child1.builder().name("child1").parent(parent).build();
		Child1 child2 = Child1.builder().name("child2").parent(parent).build();
		parentRepo.save(parent);
		childRepo.save(child1);
		childRepo.save(child2);
	}

	public Parent1 readParent() {
		Parent1 parent = parentRepo.findById(1L).get();
		return parent;
	}

	public Child1 readChild() {
		Child1 child = childRepo.findById(1L).get();
		return child;

	}
}
