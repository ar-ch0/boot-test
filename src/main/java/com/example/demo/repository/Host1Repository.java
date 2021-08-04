package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Host1;

@Repository
public interface Host1Repository extends JpaRepository<Host1, Long> {

}
