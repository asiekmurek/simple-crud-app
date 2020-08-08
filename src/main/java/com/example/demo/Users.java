package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Users {

  private String userId;
  private String userName;
  private String userLstName;
  private long age;
  private long hasAnimal;
  private String animal;


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserLstName() {
    return userLstName;
  }

  public void setUserLstName(String userLstName) {
    this.userLstName = userLstName;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public long getHasAnimal() {
    return hasAnimal;
  }

  public void setHasAnimal(long hasAnimal) {
    this.hasAnimal = hasAnimal;
  }


  public String getAnimal() {
    return animal;
  }

  public void setAnimal(String animal) {
    this.animal = animal;
  }

}
