package com.example.Spring_Boot_20261114.controller;

import com.example.Spring_Boot_20261114.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ユーザーを扱うコントローラー
 */
@Controller
@RequestMapping("/users")
public class UserController {
  
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  /**
   * ユーザー一覧を表示する
   */
  @GetMapping
  public String index(Model model) {
    model.addAttribute("users", userService.findAll());
    return "users/index";
  }
}
