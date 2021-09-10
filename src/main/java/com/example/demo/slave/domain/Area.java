package com.example.demo.slave.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "area")
public class Area {
	@Id
	@Column(name = "seqno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seqno;

	@Column(name = "area_no")
	private Long areaNo;

	@Column(name = "area_name")
	private String areaName;
}
