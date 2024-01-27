package decorator;

import java.util.ArrayList;

public class Warrior extends Player {
    private void readWarriorFile() {
        try {
            ArrayList<String> warriorLines = FileReader.getLines("decorator/warrior.txt");
            lines.addAll(warriorLines);
        } catch (Exception e) {
            System.out.println("Error reading warrior file.");
            e.printStackTrace();
        }
    }

    public Warrior (String name) {
        super(new ArrayList<>(), name);
        readWarriorFile();
    }

}
