package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Subject1;

@Repository
public interface Subject1Repository extends JpaRepository<Subject1, Long> {

}
