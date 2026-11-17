package com.example.Spring_Boot_20261114.controller;

import com.example.Spring_Boot_20261114.service.UserService;
import com.example.Spring_Boot_20261114.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

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
   *
   * @return ユーザー一覧のテンプレート
   */
  @GetMapping
  public String index(Model model) {
    model.addAttribute("users", userService.findAll());
    return "users/index";
  }

  /**
   * ユーザーをIDで表示する
   *
   * @param id ユーザーID
   * @return ユーザー詳細のID
   */
  @GetMapping("/{id}")
  public String show(@PathVariable Long id, Model model) {
    Optional<User> user = userService.findById(id);

    if (user.isEmpty()) {
      return "error/404";
    }

    model.addAttribute("user", user.get());
    return "users/show";
  }

  /**
   * ユーザー作成画面を表示 
   *
   * @return ユーザー作成テンプレート
   */
  @GetMapping("/create")
  public String create() {
    return "users/create";
  }

  /**
   * ユーザーを新規作成
   *
   * @param name ユーザー名
   * @return リダイレクト先
   */
  @PostMapping("/store")
  public String store(@RequestParam String name) {
    userService.store(name);
    return "redirect:/users";
  }

  /**
   * ユーザー編集画面を表示
   *
   * @param id ユーザーID
   * @return ユーザー編集テンプレート
   */
  @GetMapping("/{id}/edit")
  public String edit(@PathVariable Long id, Model model) {
    Optional<User> user = userService.findById(id);

    if (user.isEmpty()) {
        return "error/404";
    }

    model.addAttribute("user", user.get());

    return "users/edit";
  }

  /**
   * ユーザーを編集
   *
   * @param id ユーザーID
   * @param name ユーザーネーム
   * @return リダイレクト先
   */
  @PostMapping("/{id}/update")
  public String update(@PathVariable Long id, @RequestParam String name) {
    userService.update(id, name);
    return "redirect:/users";
  }

  /**
   * ユーザーを削除
   *
   * @param id ユーザーＩＤ
   * @return リダイレクト先
   */
  @PostMapping("/{id}/delete")
  public String delete(@PathVariable Long id) {
    userService.delete(id);
    return "redirect:/users";
  }
}
