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
@Table(name = "user_sub")
public class UserSub {

	@Id
	@Column(name = "seqno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seqno;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "area_no")
	private Long areaNo;

	@Column(name = "dept_no")
	private Long deptNo;

	@Column(name = "resign")
	private Long resign;

	@Column(name = "resign_cause")
	private String resignCause;
}
