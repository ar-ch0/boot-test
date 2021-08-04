package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Parent2;

@Repository
public interface Parent2Repository extends JpaRepository<Parent2, Long> {

}
