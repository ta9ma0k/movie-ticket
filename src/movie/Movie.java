package movie;

import java.time.LocalTime;

public class Movie {
    private final LocalTime LATE = LocalTime.of(20,00);
    private String title;
    private LocalTime startTime;
    private int seatNumber;

    public Movie(String title, LocalTime startTime, int seatNumber) {
        this.title = title;
        this.startTime = startTime;
        this.seatNumber = seatNumber;
    }

    public String getTitle() {return this.title;}
    public LocalTime getStartTime() {return this.startTime;}
    public int getSeatNumber() {return this.seatNumber;}

    // LATE 20 : Start time 19 => 1
    // LATE 20 : Start time 20 => 0
    // LATE 20 : Start time 21 => -1
    public boolean isLateShow() {return LATE.compareTo(startTime) <= 0;}

}