package com.example.Spring_Boot_20261114.service;

import com.example.Spring_Boot_20261114.entity.User;
import com.example.Spring_Boot_20261114.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
   *
   * @return ユーザー一覧
   */
  public List<User> findAll() {
    return userRepository.findAll();
  }

  /**
   * ユーザーをIDから返す
   *
   * @param id ユーザーID
   * @return ユーザー
   */
  public Optional<User> findById(Long id) {
    return userRepository.findById(id);
  }

  /**
   * ユーザーを作成
   *
   * @return 作成したユーザー
   */
  public User store(String name) {
    User user = new User(name);
    return userRepository.save(user);
  }

  /**
   * ユーザーを編集
   *
   * @param id ユーザーID
   * @param name ユーザー名
   * @return 編集したユーザー
   */
  public User update(Long id, String name) {
    User user = findById(id)
      .orElseThrow(() -> new RuntimeException("ユーザーが見つかりません"));

    user.setName(name);

    return userRepository.save(user);
  }

  /**
   * ユーザーを削除する
   *
   * @param id 削除するユーザーID
   */
  public void delete(Long id) {
    userRepository.deleteById(id);
  }

}
