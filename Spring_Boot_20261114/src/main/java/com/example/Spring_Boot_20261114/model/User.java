package com.example.Spring_Boot_20261114.model;

/**
 * ユーザー情報を管理するクラス
 */
public class User {

  private String name;
  private String id;

  /**
   * Userオブジェクトを生成する
   *
   * @param name ユーザー名
   * @param id   ユーザーID
   */
  public User(String name, String id) {
    this.name = name;
    this.id = id;
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
   * ユーザーIDを取得する
   *
   * @return id ユーザーID
   */
  public String getId() {
    return this.id;
  }

  /**
   * ユーザー名をセットする
   *
   * @param name ユーザー名
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * ユーザーIDをセットする
   *
   * @param id ユーザーID
   */
  public void setId(String id) {
    this.id = id;
  }
}
