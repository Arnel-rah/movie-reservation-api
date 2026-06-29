// Showtime.java
package com.movie.box.domain.showtime;

import java.time.LocalDateTime;
import java.util.UUID;

public record Showtime(
    UUID id,
    UUID movieId,
    String movieTitle,
    LocalDateTime startTime,
    LocalDateTime endTime,
    Integer totalSeats,
    LocalDateTime createdAt) {}
