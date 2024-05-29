package Ejercicio3;
import java.time.LocalDateTime;

public class EventView {
    public void displayEventDetails(String title, LocalDateTime dateTime, String location) {
        System.out.println("Event: " + title + " at " + location + " on " + dateTime);
    }

    public void displayAttendeeRegistered(String name, String eventTitle) {
        System.out.println(name + " has been registered for " + eventTitle);
    }

    public void displayFeedbackReceived(String eventName, String feedback) {
        System.out.println("Feedback for " + eventName + ": " + feedback);
    }

    public void displayError(String message) {
        System.out.println("Error: " + message);
    }
}

