package com.movie.box.domain.movie;

import java.time.LocalDateTime;
import java.util.UUID;

public record Movie(
    UUID id,
    String title,
    String description,
    String posterUrl,
    String genre,
    LocalDateTime createdAt) {}
