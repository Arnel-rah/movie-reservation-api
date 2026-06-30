package com.movie.box.exception;

public class ReservationCancellationException extends RuntimeException {
    public ReservationCancellationException(String message) {
        super(message);
    }
}