package Ejercicio3;
import java.time.LocalDateTime;

public class Event {
    private String title;
    private LocalDateTime dateTime;
    private String location;

    public Event(String title, LocalDateTime dateTime, String location) {
        this.title = title;
        this.dateTime = dateTime;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getLocation() {
        return location;
    }
}

