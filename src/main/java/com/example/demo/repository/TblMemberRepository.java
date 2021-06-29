package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.TblMember;

public interface TblMemberRepository extends JpaRepository<TblMember, Long>{
	

}
