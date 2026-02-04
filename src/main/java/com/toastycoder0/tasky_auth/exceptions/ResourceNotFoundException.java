package com.toastycoder0.tasky_auth.exceptions;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends BaseException {
  public ResourceNotFoundException(String message) {
    super(message, HttpStatus.UNAUTHORIZED);
  }
}
