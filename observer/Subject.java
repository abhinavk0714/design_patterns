package observer;

import java.util.ArrayList;
/**
 * A subject interface
 * @author abhinavk
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(String location, String description, ArrayList<String> accomplices);
}
