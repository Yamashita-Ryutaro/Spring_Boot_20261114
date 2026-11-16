package com.example.Spring_Boot_20261114.controller.api;

import com.example.Spring_Boot_20261114.entity.User;
import com.example.Spring_Boot_20261114.service.UserService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * ユーザーを扱うAPIコントローラー
 */
@RestController
@RequestMapping("/api/users")
public class UserApiController {
  
  private final UserService userService;

  public UserApiController(UserService userService) {
    this.userService = userService;
  }

  /**
   * ユーザー一覧を返す
   */
  @GetMapping
  public List<User> index() {
    return userService.findAll();
  }
}
