package decorator;

import java.util.ArrayList;
/**
 * Abstract class that creates a Player
 * @author abhinavk
 */
public abstract class Player {
    protected String name;
    protected ArrayList<String> lines;

    /**
     * Constructor that creates a ASCII representation of a player with a name
     * @param lines ASCII representation of the player 
     * @param name name of the player
     */
    public Player(ArrayList<String> lines, String name) {
        this.lines = lines;
        this.name = name;
    }

    /**
     * Returns string representation of the name of the player
     * @return string representation of the name
     */
    public String getName() {
        return name;
    }

    /**
     * Creates what is displayed in the console
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("#### ").append(name).append(" #### \n");
        for (String line : lines) {
            result.append(line).append("\n");
        }
        return result.toString();
    }
}
