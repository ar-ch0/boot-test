package com.example.demo.slave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.slave.domain.Slave;

@Repository
public interface SlaveRepository extends JpaRepository<Slave, Long> {

}
