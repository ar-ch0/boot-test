package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Child3;
import com.example.demo.domain.Parent3;
import com.example.demo.repository.Child3Repository;
import com.example.demo.repository.Parent3Repository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ParentChildService3 {
	private final Parent3Repository parentRepo;
	private final Child3Repository childRepo;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public void save() {

		Parent3 parent = Parent3.builder().name("parent1").build();

		parentRepo.save(parent);

		Child3 child1 = Child3.builder().name("child1").parent(parent).build();
		Child3 child2 = Child3.builder().name("child2").parent(parent).build();

		childRepo.save(child1);
		childRepo.save(child2);

	}

	public Parent3 readParent() {
		Parent3 parent = parentRepo.findById(1L).get();

		return parent;
	}

	public Child3 readChild() {
		Child3 child = childRepo.findById(1L).get();

		return child;

	}
}
