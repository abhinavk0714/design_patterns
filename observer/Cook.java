package observer;

import java.util.ArrayList;

public class Cook implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    public Cook(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String location, String description, ArrayList<String> accomplices) {
        for(Observer observer : observers)
            observer.update(location, description, accomplices);
    }

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
    
    public String getName() {
        return name;
    }
}
