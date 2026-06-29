package com.movie.box.domain.seat;

import java.util.UUID;

public record Seat(UUID id, UUID showtimeId, String seatNumber, SeatStatus status) {}
