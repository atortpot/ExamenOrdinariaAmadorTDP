package Ejercicio3;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class EventController {
    private List<Event> events = new ArrayList<>();
    private List<Attendee> attendees = new ArrayList<>();
    private List<Feedback> feedbacks = new ArrayList<>();
    private EventView view;

    public EventController(EventView view) {
        this.view = view;
    }

    public void createEvent(String title, LocalDateTime dateTime, String location) {
        Event event = new Event(title, dateTime, location);
        events.add(event);
        view.displayEventDetails(title, dateTime, location);
    }

    public void registerAttendee(String name, String email, String eventTitle) {
        Attendee attendee = new Attendee(name, email);
        attendees.add(attendee);
        Event event = events.stream().filter(e -> e.getTitle().equals(eventTitle)).findFirst().orElse(null);
        if (event != null) {
            view.displayAttendeeRegistered(name, eventTitle);
        } else {
            view.displayError("Event not found.");
        }
    }

    public void receiveFeedback(String eventName, String attendeeEmail, String comments, int rating) {
        Event event = events.stream().filter(e -> e.getTitle().equals(eventName)).findFirst().orElse(null);
        Attendee attendee = attendees.stream().filter(a -> a.getEmail().equals(attendeeEmail)).findFirst().orElse(null);
        if (event != null && attendee != null) {
            Feedback feedback = new Feedback(event, attendee, comments, rating);
            feedbacks.add(feedback);
            view.displayFeedbackReceived(eventName, comments);
        } else {
            view.displayError("Event or attendee not found.");
        }
    }
}
