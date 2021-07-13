package com.example.demo.service;

import com.example.demo.domain.User;

public interface CacheService {

	public User test(User user);

	public User testRefresh(User user);

}
