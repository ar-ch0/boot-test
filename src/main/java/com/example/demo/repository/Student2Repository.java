package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Student2;

@Repository
public interface Student2Repository extends JpaRepository<Student2, Long> {

}
