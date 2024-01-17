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
        this.locations = new ArrayList<>();
        this.notes = "";
        this.people = new ArrayList<>();
    }

    public void update(String location, String description, ArrayList<String> accomplices) {
        // Reset the accomplices list for each update
        this.locations.add(location);
        this.notes = description;
        this.people.clear();
        this.people.addAll(accomplices);
        // locations.add(location);
        // notes += description + "\n"; // Append the new note to the existing notes
    
        // Check if accomplices is not null before adding to the people list
        if (accomplices != null) {
            people.addAll(accomplices);
        }
    }
    

    public String getLog() {
        StringBuilder logBuilder = new StringBuilder("Locations:\n");
        for (String location : locations) {
            logBuilder.append("- ").append(location).append("\n");
        }

        if (!notes.isEmpty()) {
            logBuilder.append("\nNotes:\n");
            String[] noteArray = notes.split("\n");
            for (String note : noteArray) {
                logBuilder.append("- ").append(note).append("\n");
            }
        }

        logBuilder.append("\nAccomplices:\n");
        for (String accomplices : people) {
            logBuilder.append("- ").append(accomplices).append("\n");
        }

        return logBuilder.toString();
    }
}
