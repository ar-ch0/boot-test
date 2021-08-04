package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Parent3;

@Repository
public interface Parent3Repository extends JpaRepository<Parent3, Long> {

}
