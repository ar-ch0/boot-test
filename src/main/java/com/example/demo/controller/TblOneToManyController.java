package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.TblMember;
import com.example.demo.domain.TblPhone;
import com.example.demo.service.TblOneToManyService;

import io.swagger.annotations.Api;

@Api
@RestController
@RequestMapping("/jpatest3")
public class TblOneToManyController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private TblOneToManyService tblOneToManyService;

	@PostMapping("/tbl-member/create")
	public ResponseEntity<TblMember> createMember(@RequestBody TblMember tblMember) {
		tblMember.addPhone(new TblPhone("010-XXXX-YYYY"));
		tblMember.addPhone(new TblPhone("010-YYYY-XXXX"));
		TblMember result = tblOneToManyService.saveMember(tblMember);
		return new ResponseEntity<>(result, HttpStatus.CREATED);

	}

}
