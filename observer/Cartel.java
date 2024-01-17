package observer;

import java.util.ArrayList;

public class Cartel implements Observer {
    private Subject cook;
    private ArrayList<Sighting> sightings;

    public Cartel(Subject cook) {
        //
    }

    public void update(String location, String description, ArrayList<String> accomplices) {

    }

    public String getLog() {
        return null;
    }
}
