package observer;

import java.util.ArrayList;
/**
 * Police class that implements Observer
 * @author abhinavk
 */
public class Police implements Observer {
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;

    /**
     * Constructor that creates a Police
     * @param cook Observes subject cook
     */
    public Police(Subject cook) {
        this.cook = cook;
        cook.registerObserver(this);
        this.locations = new ArrayList<>();
        this.notes = "";
        this.people = new ArrayList<>();
    }

    /** 
     * Updates the Police about the subjects location, description, and accomplices
     * @param location location of the subject
     * @param description description about the what the subject is doing
     * @param accomplices accomplices that were with the subject
     */
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
    
    /** 
     * Gets a log for the police about everything the from the subject
     * @return String representation of everything from the subject
     */
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
