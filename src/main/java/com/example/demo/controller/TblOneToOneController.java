package com.example.demo.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.TblUser;
import com.example.demo.service.TblOneToOneService;

import io.swagger.annotations.Api;

@Api
@RestController
@RequestMapping("/jpatest2")
public class TblOneToOneController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	TblOneToOneService tblUserService;

	@PostMapping("/tbl-user/create")
	public ResponseEntity<TblUser> createUser(@RequestBody TblUser tblUser) {
		TblUser result = tblUserService.userSaveAndUpdate(tblUser);
		return new ResponseEntity<>(result, HttpStatus.CREATED);

	}

	@GetMapping("/tbl-user/{id}")
	public ResponseEntity<TblUser> getUser(@PathVariable Integer id) {
		Optional<TblUser> result = tblUserService.getUser(id);
		return new ResponseEntity<>(result.get(), HttpStatus.OK);
	}
}
