package com.github.daniellimadev.microservice.user.DTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRecordDTO(@NotBlank String name,
                            @NotBlank @Email String email) {
}
