package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Target1;

@Repository
public interface Target1Repository extends JpaRepository<Target1, Long> {

}
