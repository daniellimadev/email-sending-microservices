package com.github.daniellimadev.microservice.user.repository;

import com.github.daniellimadev.microservice.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
