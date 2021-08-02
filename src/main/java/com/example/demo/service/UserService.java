package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.support.UserRepositorySupport;

@Service
public class UserService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserRepositorySupport userRepoSupport;

	public void create(User param) {
		userRepository.save(param);
	}

	public Optional<User> read(Long param) {
		Optional<User> user = userRepository.findById(param);
		return user;
	}

	public List<User> listAllUser() {
		List<User> list = new ArrayList<>();
		Iterable<User> iterable = userRepository.findAll();
		for (User user : iterable) {
			list.add(user);
		}
		return list;
	}

	public void deleteUser(Long param) {
		userRepository.deleteById(param);
	}

	public User updateUser(User param) {
		User updatedUser = userRepository.save(param);
		return updatedUser;
	}

	public void updateUserNameQuerydsl(String name, String email) {
		userRepoSupport.updateUserName(name, email);
	}

	public void deleteUserNameQuerydsl(String name) {
		userRepoSupport.deleteUserName(name);
	}

}
