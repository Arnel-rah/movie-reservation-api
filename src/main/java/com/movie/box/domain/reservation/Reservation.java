package com.movie.box.domain.reservation;

import java.time.LocalDateTime;
import java.util.UUID;

public record Reservation(
    UUID id, UUID userId, UUID seatId, UUID showtimeId, LocalDateTime createdAt) {}
