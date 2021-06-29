package com.example.demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.TblMember;
import com.example.demo.repository.TblMemberRepository;
import com.example.demo.repository.TblPhoneRepository;
import com.example.demo.service.TblOneToManyService;


@Service
public class TblOneToManyServiceImpl implements TblOneToManyService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private TblMemberRepository tmr;
	
	@Autowired
	private TblPhoneRepository tpr;
	
	@Override
	public TblMember saveMember(TblMember tblMember) {
		tmr.save(tblMember);
	
		return tblMember;
	}
	
}
