package com.toastycoder0.tasky_auth.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toastycoder0.tasky_auth.exceptions.ResourceNotFoundException;
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
    return userRespository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado"));
  }

  public UserModel saveUser(UserModel user) {
    return userRespository.save(user);
  }

  public UserModel updateUser(UUID id, UserModel userDetails) {
    return userRespository.findById(id).map(user -> {
      user.setEmail(userDetails.getEmail());
      user.setPassword(userDetails.getPassword());
      user.setActive(userDetails.isActive());
      return userRespository.save(user);
    }).orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado"));
  }

  public void deleteUser(UUID id) {
    if (userRespository.existsById(id)) {
      userRespository.deleteById(id);
    } else {
      throw new ResourceNotFoundException("Usuario no encontrado");
    }
  }
}
