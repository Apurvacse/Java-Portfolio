package activity;
public class Main {
    public static void main(String[] args) {
        CalendarEvent myEvent = new CalendarEvent();
        myEvent.setEventTitle("Company Meeting");
        myEvent.setEventDate("2024-04-19");
        myEvent.setEventLocation("Conference Room A");
        myEvent.displayEventDetails();
    }
}