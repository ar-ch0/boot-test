package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Child1;

@Repository
public interface Child1Repository extends JpaRepository<Child1, Long> {

}
