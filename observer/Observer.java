package observer;

import java.util.ArrayList;
/**
 * An Observer interface
 * @author abhinavk
 */
public interface Observer {
    public void update(String location, String description, ArrayList<String> accomplices);
    public String getLog();
}
