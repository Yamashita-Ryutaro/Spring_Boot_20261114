package com.example.Spring_Boot_20261114.repository;

import com.example.Spring_Boot_20261114.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
