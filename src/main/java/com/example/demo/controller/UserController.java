package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.service.Test;
import com.example.demo.service.UserService;

import io.swagger.annotations.Api;

@Api
@RestController
@RequestMapping("/jpatest")
public class UserController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	UserService userService;

	@Autowired
	@Qualifier("Test2Impl")
	Test test;

	@PostMapping("/user/create")
	public ResponseEntity<String> createUser(@RequestBody User user) {
		userService.create(user);
		return new ResponseEntity<String>(HttpStatus.CREATED);

	}

	@GetMapping("/user")
	public ResponseEntity<List<User>> userList() {
		return new ResponseEntity<List<User>>(userService.listAllUser(), HttpStatus.OK);
	}

	@GetMapping("/user/{userId}")
	public ResponseEntity<Optional<User>> user(@PathVariable("userId") Long userId) {
		return new ResponseEntity<Optional<User>>(userService.read(userId), HttpStatus.OK);
	}

	@PutMapping("/user/{userId}/{test}")
	public ResponseEntity<User> updateUser(@PathVariable("userId") Long userId, @PathVariable("test") String test) {
		logger.info(test);
		User user = new User();
		// user.setId(userId); , @RequestBody User user
		return new ResponseEntity<User>(userService.updateUser(user), HttpStatus.OK);

	}

	@DeleteMapping("/user/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable("userId") Long userId) {
		userService.deleteUser(userId);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@PutMapping("/user-dsl/{name}/{email}")
	public void updateUserQuerydsl(@PathVariable("name") String name, @PathVariable("email") String email) {
		logger.info(name + email);
		userService.updateUserNameQuerydsl(name, email);

	}

	@DeleteMapping("/user-dsl/{name}")
	public void deleteUserQuerydsl(@PathVariable("name") String name) {
		logger.info(name);
		userService.deleteUserNameQuerydsl(name);
	}

	@PostMapping("/test")
	public void test() {
		test.test();
	}

}
