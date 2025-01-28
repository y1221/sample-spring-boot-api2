package com.example.sample_spring_boot_api2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sample_spring_boot_api2.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
