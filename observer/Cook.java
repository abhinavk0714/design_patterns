package observer;

import java.util.ArrayList;
/**
 * Cook class that implemets Subject
 * @author abhinavk
 */
public class Cook implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    /**
     * Constructor that creates the cook and initializes the observers
     * @param name String representation of the name of the cook
     */
    public Cook(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }

    /** 
     * Registers the observers
     * @param observer The observer
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /** 
     * Removes observers
     * @param observer The observer
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /** 
     * Notifies the observers about the subject's location, description, and accomplices
     * @param location location of the subject
     * @param description description of the subject
     * @param accomplices accomplices with the subject
     */
    public void notifyObservers(String location, String description, ArrayList<String> accomplices) {
        for(Observer observer : observers)
            observer.update(location, description, accomplices);
    }

    /** 
     * Enters sightings about the subject
     * @param location location of the subject
     * @param description description of the subject
     * @param accomplices accomplices with the subject
     */
    public void enterSighting(String location, String description, String accomplices) {
        ArrayList<String> accompliceList = new ArrayList<>();
        if (accomplices != null && !accomplices.isEmpty()) {
            // Split the comma-separated accomplices
            String[] accompliceArray = accomplices.split(", ");
    
            // Add only unique accomplices to the list
            for (String accomplice : accompliceArray) {
                if (!accompliceList.contains(accomplice)) {
                    accompliceList.add(accomplice);
                }
            }
        }
    
        notifyObservers(location, description, accompliceList);
    }
    
    /** 
     * Name of the subject
     * @return String representation of the name
     */
    public String getName() {
        return name;
    }
}
