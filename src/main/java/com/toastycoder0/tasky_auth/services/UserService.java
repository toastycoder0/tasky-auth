package com.toastycoder0.tasky_auth.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toastycoder0.tasky_auth.models.UserModel;
import com.toastycoder0.tasky_auth.repositories.UserRespository;

@Service
public class UserService {
  @Autowired
  private UserRespository userRespository;

  public List<UserModel> getAllUsers() {
    return userRespository.findAll();
  }

  public UserModel getUserById(UUID id) {
    return userRespository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
  }

  public UserModel saveUser(UserModel user) {
    return userRespository.save(user);
  }
}
