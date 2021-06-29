package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tbl_user_extra")
public class TblUserExtra {
	@Id
	@Column(name = "user_no")
	private Integer userNo;

	@Column(name = "phone_num")
	private String phoneNum;

}
