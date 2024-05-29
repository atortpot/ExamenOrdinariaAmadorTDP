package Ejercicio3;
import java.time.LocalDateTime;


public class EventManager {

    public static void main(String[] args) {

        EventView view = new EventView();


        EventController controller = new EventController(view);


        controller.createEvent("Annual Marketing Meeting", LocalDateTime.of(2024, 10, 15, 14, 0), "Conference Room A");
        controller.createEvent("Quarterly Sales Review", LocalDateTime.of(2024, 11, 20, 9, 30), "Conference Room B");


        controller.registerAttendee("John Doe", "john.doe@example.com", "Annual Marketing Meeting");
        controller.registerAttendee("Jane Smith", "jane.smith@example.com", "Quarterly Sales Review");


        controller.receiveFeedback("Annual Marketing Meeting", "john.doe@example.com", "Very informative and well-organized.", 5);
        controller.receiveFeedback("Quarterly Sales Review", "jane.smith@example.com", "Excellent speakers, but started late.", 4);


    }
}

