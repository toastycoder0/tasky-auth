package com.toastycoder0.tasky_auth.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserModel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(columnDefinition = "UUID", updatable = false, nullable = false)
  private UUID id;

  @Column(nullable = false, unique = true)
  private String email;

  @Column(nullable = false)
  private String password;

  private boolean isActive = true;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean isActive) {
    this.isActive = isActive;
  }
}
