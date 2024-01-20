package observer;

import java.util.ArrayList;
/**
 * Information about the subject for the cartel
 * @author abhinavk
 */
public class Sighting {
    private String location;
    private String details;
    private ArrayList<String> accomplices;

    /**
     * Constructor that creates the location, details, and accomplices for the cartel
     * @param location location of the subject
     * @param details details about what the subject was doing
     * @param accomplices accomplices with the subject
     */
    public Sighting(String location, String details, ArrayList<String> accomplices) {
        this.location = location;
        this.details = details;
        this.accomplices = accomplices;
    }

    /** 
     * Returns the location of the subject
     * @return String representation of the location
     */
    public String getLocation() {
        return location;
    }

    /** 
     * Returns the details of what the subject was doing
     * @return String representation of the details
     */
    public String getDetails() {
        return details;
    }

    /** 
     * Returns the accomplices that were with the subject
     * @return String representation of the accomplices
     */
    public String getAccomplices() {
        if (accomplices != null && !accomplices.isEmpty()) {
            // Join accomplices using commas
            return String.join(", ", accomplices);
        } else {
            return "No accomplices";
        }
    }
}
