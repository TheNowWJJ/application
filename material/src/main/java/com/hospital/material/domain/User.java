package com.hospital.material.domain;

/**
 * 描述: TODO:
 * 包名: com.hospital.material.domain.
 * 作者: barton.
 * 日期: 16-10-16.
 * 项目名称: hospital
 * 版本: 1.0
 * JDK: since 1.8
 */
public class User {
  private int id;

  private String name;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" +
     "id=" + id +
     ", name='" + name + '\'' +
     '}';
  }
}
