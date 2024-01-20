package observer;

import java.util.ArrayList;
/**
 * Cartel class that implements Observer
 * @author abhinavk
 */
public class Cartel extends Sighting implements Observer {
    private Subject cook;
    private ArrayList<Sighting> sightings;
    
    /**
     * Constructor that creates a cartel
     * @param cook Observes subject cook
     */
    public Cartel(Subject cook) {
        super("", "", new ArrayList<>()); // Call Sighting constructor with default values
        this.cook = cook;
        cook.registerObserver(this);
        this.sightings = new ArrayList<>();
    }

    /** 
     * Updates the location, description, and accomplices for the cartel
     * @param location location of subject
     * @param description description of what subject was doing
     * @param accomplices accomplices subject was with
     */
    public void update(String location, String description, ArrayList<String> accomplices) {
        // Store the updated sighting in the sightings ArrayList if needed
        Sighting updatedSighting = new Sighting(location, description, accomplices);
        sightings.add(updatedSighting);
    }

    /** 
     * Gets a log for the cartel about the subject in the form of a String
     * @return String that has all details about the subject
     */
    public String getLog() {
        String result = "";
        for (Sighting sighting : sightings) {
            String entry = String.format("%s (%s), with %s\n",
                    sighting.getLocation(), sighting.getDetails(), sighting.getAccomplices());
            result += entry;
        }
        return result;
    }
}
