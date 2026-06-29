package com.movie.box.domain.user;

import java.time.LocalDateTime;
import java.util.UUID;

public record User(
    UUID id, String email, String fullName, UserRole role, LocalDateTime createdAt) {}
