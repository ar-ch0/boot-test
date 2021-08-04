package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Target2;

@Repository
public interface Target2Repository extends JpaRepository<Target2, Long> {

}
