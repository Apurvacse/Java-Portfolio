package activity;
public class CalendarEvent {
    private String eventTitle;
    private String eventDate;
    private String eventLocation;

    public CalendarEvent() {
        this.eventTitle = "";
        this.eventDate = "";
        this.eventLocation = "";
    }
    public void setEventTitle(String title) {
        this.eventTitle = title;
    }

    public void setEventDate(String date) {
        this.eventDate = date;
    }

    public void setEventLocation(String location) {
        this.eventLocation = location;
    }
    public String getEventTitle() {
        return this.eventTitle;
    }

    public String getEventDate() {
        return this.eventDate;
    }

    public String getEventLocation() {
        return this.eventLocation;
    }
    public void displayEventDetails() {
        System.out.println("Event Title: " + this.eventTitle);
        System.out.println("Event Date: " + this.eventDate);
        System.out.println("Event Location: " + this.eventLocation);
        }
}
