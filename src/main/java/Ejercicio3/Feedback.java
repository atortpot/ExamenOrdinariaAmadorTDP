package Ejercicio3;
public class Feedback {
    private Event event;
    private Attendee attendee;
    private String comments;
    private int rating; // Rating from 1 to 5

    public Feedback(Event event, Attendee attendee, String comments, int rating) {
        this.event = event;
        this.attendee = attendee;
        this.comments = comments;
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public int getRating() {
        return rating;
    }

    public Event getEvent() {
        return event;
    }

    public Attendee getAttendee() {
        return attendee;
    }
}
