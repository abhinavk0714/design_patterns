package decorator;

import java.util.ArrayList;

/**
 * A warrior that is a player
 * @author abhinavk
 */
public class Warrior extends Player {
    /**
     * Private helper method that reads the warrior.txt file to create an ASCII representation of the warrior
     */
    private void readWarriorFile() {
        try {
            ArrayList<String> warriorLines = FileReader.getLines("decorator/warrior.txt");
            lines.addAll(warriorLines);
        } catch (Exception e) {
            System.out.println("Error reading warrior file.");
            e.printStackTrace();
        }
    }

    /**
     * Constructor that creates a Warrior
     * @param name name of the warrior
     */
    public Warrior (String name) {
        super(new ArrayList<>(), name);
        readWarriorFile();
    }

}
