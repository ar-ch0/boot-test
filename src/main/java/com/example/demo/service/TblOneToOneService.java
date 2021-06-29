package com.example.demo.service;

import java.util.Optional;

import com.example.demo.domain.TblUser;

public interface TblOneToOneService {

	public TblUser userSaveAndUpdate(TblUser input);

	public Optional<TblUser> getUser(Integer id);
}
