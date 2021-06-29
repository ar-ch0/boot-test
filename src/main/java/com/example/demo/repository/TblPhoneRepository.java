package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.TblPhone;

public interface TblPhoneRepository extends JpaRepository<TblPhone, Long> {

}
