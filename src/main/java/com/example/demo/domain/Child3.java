package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Child3 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@ManyToOne
	@JoinColumn(name = "parent_id")
	@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
	private Parent3 parent;

	@Builder
	public Child3(String name, Parent3 parent) {
		this.name = name;
		this.parent = parent;
	}

}