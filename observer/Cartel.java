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
    }

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
