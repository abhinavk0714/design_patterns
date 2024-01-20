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
        this.locations.add(location);
        
        // Append the new note to the existing notes
        if (!notes.isEmpty()) {
            notes += "\n";
        }
        notes += description;

        // Check if accomplices is not null before adding to the people list
        if (accomplices != null) {
            for (String accomplice : accomplices) {
                if (!people.contains(accomplice)) {
                    people.add(accomplice);
                }
            }
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
