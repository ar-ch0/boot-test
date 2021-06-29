package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class TblPhone {

	@Id
	@Column(name = "seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seq;

	// @Column(name = "member_id")
	// private Integer memberId;

	@Column(name = "no")
	private String no;

	@ManyToOne(targetEntity = TblMember.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id")
	private TblMember member;

	public TblPhone(String no) {
		this.no = no;
	}

	@Override
	public String toString() {
		String result = "[phone_" + seq + "] " + no;
		return result;
	}
}
