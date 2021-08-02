package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.TblUser;
import com.example.demo.repository.TblUserRepository;

@Service
public class TblOneToOneService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private TblUserRepository tblUserRepository;

	@Transactional
	public TblUser userSaveAndUpdate(TblUser tblUser) {
		return tblUserRepository.save(tblUser);
	}

	public Optional<TblUser> getUser(Integer id) {

		Optional<TblUser> user = tblUserRepository.findById(id);
		logger.info("사용자 번호 : " + user.get().getUserNo());
		return user;
	}

}
