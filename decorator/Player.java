package decorator;

import java.util.ArrayList;

public abstract class Player {
    protected String name;
    protected ArrayList<String> lines;

    public Player(ArrayList<String> lines, String name) {
        this.lines = lines;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("#### ").append(name).append(" #### \n");
        for (String line : lines) {
            result.append(line).append("\n");
        }
        return result.toString();
    }
}
