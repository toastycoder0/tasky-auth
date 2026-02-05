package com.toastycoder0.tasky_auth.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toastycoder0.tasky_auth.dtos.GenericResponse;
import com.toastycoder0.tasky_auth.models.UserModel;
import com.toastycoder0.tasky_auth.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired
  private UserService userService;

  @GetMapping
  public List<UserModel> getUsers() {
    return userService.getAllUsers();
  }

  @GetMapping("/{id}")
  public UserModel getUserById(@PathVariable UUID id) {
    return userService.getUserById(id);
  }

  @PostMapping
  public UserModel createUser(@RequestBody UserModel user) {
    return userService.saveUser(user);
  }

  @PutMapping("/{id}")
  public UserModel updateUser(@PathVariable UUID id, @RequestBody UserModel user) {
    System.out.println(id + " " + user.getEmail());

    return userService.updateUser(id, user);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<GenericResponse> deleteUser(@PathVariable UUID id) {
    userService.deleteUser(id);
    return ResponseEntity.ok(new GenericResponse("Usuario con id: " + id + " eliminado"));
  }
}
