package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Subject2;

@Repository
public interface Subject2Repository extends JpaRepository<Subject2, Long>{

}
