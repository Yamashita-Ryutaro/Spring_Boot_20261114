package com.example.Spring_Boot_20261114.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

/**
 * ユーザー情報テーブル
 */
@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  /**
   * ユーザーテーブル
   */
  public User() {
  }

  /**
   * ユーザーを作成
   *
   * @param name ユーザー名
   */
  public User(String name) {
    this.name = name;
  }

  /**
   * ユーザーIDを取得する
   *
   * @return id ユーザーID
   */
  public Long getId() {
    return this.id;
  }

  /**
   * ユーザー名を取得する
   *
   * @return name ユーザー名
   */
  public String getName() {
    return this.name;
  }

  /**
   * ユーザーIDをセットする
   *
   * @param id ユーザーID
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * ユーザー名をセットする
   *
   * @param name ユーザー名
   */
  public void setName(String name) {
    this.name = name;
  }
}
