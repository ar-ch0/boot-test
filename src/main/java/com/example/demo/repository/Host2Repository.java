package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Host2;

@Repository
public interface Host2Repository extends JpaRepository<Host2, Long> {
}
