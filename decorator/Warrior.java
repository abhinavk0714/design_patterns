package decorator;

import java.util.ArrayList;

public class Warrior extends Player {
    public Warrior (String name) {
        super(new ArrayList<>(), name);
        readWarriorFile();
    }

    private void readWarriorFile() {
        try {
            ArrayList<String> warriorLines = FileReader.getLines("warrior.txt");
            lines.addAll(warriorLines);
        } catch (Exception e) {
            System.out.println("Error reading warrior file.");
            e.printStackTrace();
        }
    }
}
