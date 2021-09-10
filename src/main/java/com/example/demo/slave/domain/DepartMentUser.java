package com.example.demo.slave.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Subselect;

import lombok.Data;

@Entity
@Data
@Subselect("select resign, resign_cause from user_sub group by resign")
public class DepartMentUser {
	@Id
	@Column(name = "resign")
	private Long resign;

	@Column(name = "resign_cause")
	private String resignCause;
}
