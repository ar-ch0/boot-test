package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Child3;

@Repository
public interface Child3Repository extends JpaRepository<Child3, Long> {

}
