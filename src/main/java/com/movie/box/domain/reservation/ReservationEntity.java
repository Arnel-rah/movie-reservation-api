package com.movie.box.domain.reservation;

import com.movie.box.domain.seat.SeatEntity;
import com.movie.box.domain.showtime.ShowtimeEntity;
import com.movie.box.domain.user.UserEntity;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "reservations")
public class ReservationEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id", nullable = false)
  private UserEntity user;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "seat_id", nullable = false)
  private SeatEntity seat;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "showtime_id", nullable = false)
  private ShowtimeEntity showtime;

  @Column(name = "created_at", updatable = false)
  private LocalDateTime createdAt;

  @PrePersist
  protected void onCreate() {
    this.createdAt = LocalDateTime.now();
  }

  public UUID getId() {
    return id;
  }

  public UserEntity getUser() {
    return user;
  }

  public SeatEntity getSeat() {
    return seat;
  }

  public ShowtimeEntity getShowtime() {
    return showtime;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public void setUser(UserEntity user) {
    this.user = user;
  }

  public void setSeat(SeatEntity seat) {
    this.seat = seat;
  }

  public void setShowtime(ShowtimeEntity showtime) {
    this.showtime = showtime;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }
}
