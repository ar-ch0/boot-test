package com.example.demo.slave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.slave.domain.UserSub;
@Repository
public interface UserSubRepository extends JpaRepository<UserSub, Long>{

}