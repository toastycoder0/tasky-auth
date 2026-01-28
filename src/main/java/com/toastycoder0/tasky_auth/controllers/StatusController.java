package com.toastycoder0.tasky_auth.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toastycoder0.tasky_auth.dtos.GenericResponse;

@RestController
@RequestMapping("/status")
public class StatusController {
  @GetMapping
  public ResponseEntity<GenericResponse> getStatus() {
    return ResponseEntity.ok(new GenericResponse("Ok"));
  }
}
