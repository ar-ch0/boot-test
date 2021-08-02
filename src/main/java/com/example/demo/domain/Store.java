package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Getter
@Table(name = "store")
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String address;

	@OneToMany(mappedBy = "store")
	private List<Staff> staff = new ArrayList<>();

	@Builder
	public Store(Long id, String name, String address, List<Staff> staff) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.staff = staff;
	}
}
