package com.github.daniellimadev.microservice.user.DTOs;

import lombok.Data;

import java.util.UUID;

@Data
public class EmailDto {

    private UUID userId;
    private String emailTo;
    private String subject;
    private String text;
}
