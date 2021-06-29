package com.example.demo.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tbl_user")
public class TblUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_no", updatable = false, insertable = false)
	private Integer userNo;

	@Column(name = "user_name")
	private String userName;

	@OneToOne(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@JoinColumn(name = "user_no", insertable = false)
	private TblUserExtra userExtra;

}
