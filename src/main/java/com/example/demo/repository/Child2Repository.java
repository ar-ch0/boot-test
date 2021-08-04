package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Child2;

@Repository
public interface Child2Repository extends JpaRepository<Child2, Long> {

}
