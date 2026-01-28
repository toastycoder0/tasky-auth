package com.toastycoder0.tasky_auth.repositories;

import java.util.UUID;

import com.toastycoder0.tasky_auth.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<UserModel, UUID> {
}
