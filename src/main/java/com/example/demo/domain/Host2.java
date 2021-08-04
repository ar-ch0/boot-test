package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Host2 {

	// 1:1 양방향
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@OneToOne
	@JoinColumn(name = "target_id")
	@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
	private Target2 target;

	@Builder
	public Host2(String name, Target2 target) {
		this.name = name;
		this.target = target;
	}

}
