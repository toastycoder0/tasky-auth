package com.toastycoder0.tasky_auth.dtos;

public record GenericResponse(
    int status,
    String message) {
  public GenericResponse(String message) {
    this(200, message);
  }
}
