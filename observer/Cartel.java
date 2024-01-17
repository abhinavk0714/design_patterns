package observer;

import java.util.ArrayList;

public class Cartel extends Sighting implements Observer {
    private Subject cook;
    private ArrayList<Sighting> sightings;

    public Cartel(Subject cook) {
        super("", "", new ArrayList<>()); // Call Sighting constructor with default values
        this.cook = cook;
        cook.registerObserver(this);
        this.sightings = new ArrayList<>();
    }

    public void update(String location, String description, ArrayList<String> accomplices) {
        // Store the updated sighting in the sightings ArrayList if needed
        Sighting updatedSighting = new Sighting(location, description, accomplices);
        sightings.add(updatedSighting);
        // // Get the current state of Cartel
        // String currentLocation = this.getLocation();
        // String currentDetails = this.getDetails();

        // // Store the updated sighting in the sightings ArrayList if needed
        // Sighting updatedSighting = new Sighting(currentLocation, currentDetails, accomplices);
        // sightings.add(updatedSighting);
        // getLog();
    }

    public String getLog() {
        return getLocation() + "(" + getDetails() + "), with " + getAccomplices();
    }
}
