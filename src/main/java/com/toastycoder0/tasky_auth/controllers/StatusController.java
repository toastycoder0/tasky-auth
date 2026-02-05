package com.toastycoder0.tasky_auth.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toastycoder0.tasky_auth.dtos.GenericResponse;
import com.toastycoder0.tasky_auth.repositories.UserRespository;

@RestController
@RequestMapping("/status")
public class StatusController {
  @Autowired
  private UserRespository userRespository;

  @GetMapping
  public ResponseEntity<GenericResponse> getStatus() {
    userRespository.count();
    return ResponseEntity.ok(new GenericResponse("Ok"));
  }
}
