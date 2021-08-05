package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Student1;

@Repository
public interface Student1Repository extends JpaRepository<Student1, Long> {

}
