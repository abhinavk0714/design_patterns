package observer;

import java.util.ArrayList;

public class Police implements Observer {
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;

    public Police(Subject cook) {
        this.cook = cook;
        cook.registerObserver(this);
    }
    
    public void update(String location, String description, ArrayList<String> accomplices) {
        // this.locations = location;
        this.notes = description;
        this.people = accomplices;
    }

    public String getLog() {
        return notes;
    }
}
