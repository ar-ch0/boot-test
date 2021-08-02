package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.TblMember;
import com.example.demo.repository.TblMemberRepository;
import com.example.demo.repository.TblPhoneRepository;


@Service
public class TblOneToManyService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private TblMemberRepository tmr;
	
	@Autowired
	private TblPhoneRepository tpr;
	

	public TblMember saveMember(TblMember tblMember) {
		tmr.save(tblMember);
	
		return tblMember;
	}
	
}
