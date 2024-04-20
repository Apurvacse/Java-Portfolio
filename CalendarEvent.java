package activity;
public class CalendarEvent {
    // Private member variables
    private String eventTitle;
    private String eventDate;
    private String eventLocation;

    // Constructor
    public CalendarEvent() {
        // Initialize with default values
        this.eventTitle = "";
        this.eventDate = "";
        this.eventLocation = "";
    }

    // Methods to set the details of the event
    public void setEventTitle(String title) {
        this.eventTitle = title;
    }

    public void setEventDate(String date) {
        this.eventDate = date;
    }

    public void setEventLocation(String location) {
        this.eventLocation = location;
    }

    // Methods to get the details of the event
    public String getEventTitle() {
        return this.eventTitle;
    }

    public String getEventDate() {
        return this.eventDate;
    }

    public String getEventLocation() {
        return this.eventLocation;
    }

    // Method to display event details
    public void displayEventDetails() {
        System.out.println("Event Title: " + this.eventTitle);
        System.out.println("Event Date: " + this.eventDate);
        System.out.println("Event Location: " + this.eventLocation);
        }
}
public class CalendarEvent {
    public static void main(String[] args) {
        CalendarEvent myEvent = new CalendarEvent();
        myEvent.setEventTitle("Company Meeting");
        myEvent.setEventDate("2024-04-19");
        myEvent.setEventLocation("Conference Room A");
        myEvent.displayEventDetails();
    }
}