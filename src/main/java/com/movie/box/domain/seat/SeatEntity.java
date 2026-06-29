package com.movie.box.domain.seat;

import com.movie.box.domain.showtime.ShowtimeEntity;
import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "seats")
public class SeatEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "showtime_id", nullable = false)
  private ShowtimeEntity showtime;

  @Column(name = "seat_number", nullable = false)
  private String seatNumber;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private SeatStatus status = SeatStatus.AVAILABLE;

  public UUID getId() {
    return id;
  }

  public ShowtimeEntity getShowtime() {
    return showtime;
  }

  public String getSeatNumber() {
    return seatNumber;
  }

  public SeatStatus getStatus() {
    return status;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public void setShowtime(ShowtimeEntity showtime) {
    this.showtime = showtime;
  }

  public void setSeatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
  }

  public void setStatus(SeatStatus status) {
    this.status = status;
  }
}
