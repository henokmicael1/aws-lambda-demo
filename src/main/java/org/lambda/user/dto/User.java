package org.lambda.user.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private String phoneNumber;
    private LocalDateTime dateOfBirth;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean active;

}