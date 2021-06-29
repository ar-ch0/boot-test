package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void create(User param) {
		userRepository.save(param);
	}

	@Override
	public Optional<User> read(Long param) {
		Optional<User> user = userRepository.findById(param);
		return user;
	}

	@Override
	public List<User> listAllUser() {
		List<User> list = new ArrayList<>();
		Iterable<User> iterable = userRepository.findAll();
		for (User user : iterable) {
			list.add(user);
		}
		return list;
	}

	@Override
	public void deleteUser(Long param) {
		userRepository.deleteById(param);
	}

	@Override
	public User updateUser(User param) {
		User updatedUser = userRepository.save(param);
		return updatedUser;
	}

}
