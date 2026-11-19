package com.example.Spring_Boot_20261114.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRegisterDto {

  @NotBlank(message = "名前は必須です")
  @Size(min = 2, max = 30, message = "名前は2文字以上30文字以内で入力してください")
  private String name;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
