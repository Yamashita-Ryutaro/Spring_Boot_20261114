package com.example.Spring_Boot_20261114.service;

import com.example.Spring_Boot_20261114.entity.User;
import com.example.Spring_Boot_20261114.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ユーザーを扱うサービス
 */
@Service
public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  /**
   * ユーザー一覧を返す
   */
  public List<User> findAll() {
    return userRepository.findAll();
  }
}
