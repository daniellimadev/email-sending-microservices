package com.github.daniellimadev.microservice.email.repository;

import com.github.daniellimadev.microservice.email.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<Email, UUID> {
}