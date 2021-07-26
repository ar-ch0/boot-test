package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.User;

public interface UserService {

	public void create(User param);

	public Optional<User> read(Long param);

	public void deleteUser(Long param);

	public List<User> listAllUser();

	public User updateUser(User param);

	public void updateUserNameQuerydsl(String name, String email);

	public void deleteUserNameQuerydsl(String name);

}
