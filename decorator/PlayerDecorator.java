package decorator;

import java.util.ArrayList;

/**
 * Class that decorates a Player
 * @author abhinavk
 */
public abstract class PlayerDecorator extends Player {
    private Player player;

    /**
     * Constructor that creates a new ArrayList of a player to decorate
     * @param player the player being decorated
     */
    public PlayerDecorator(Player player) {
        super(new ArrayList<>(), player.getName());
        this.player = player;
    }

    /**
     * Integrates the decor to the warrior and returns the finished product
     * @param decor ASCII representation of the warrior decorated
     */
    protected void integrateDecor(ArrayList<String> decor) {
        // Get the existing lines of the warrior
        ArrayList<String> warriorLines = new ArrayList<>(player.lines);

        for (int i = 0; i < warriorLines.size(); i++) {
            String warriorLine = warriorLines.get(i);
            String decorLine = (i < decor.size()) ? decor.get(i) : ""; // Use decor line if available, otherwise an empty string

            int maxLen = Math.max(warriorLine.length(), decorLine.length());
            StringBuilder integratedLine = new StringBuilder();

            for (int j = 0; j < maxLen; j++) {
                char warriorChar = (j < warriorLine.length()) ? warriorLine.charAt(j) : ' ';
                char decorChar = (j < decorLine.length()) ? decorLine.charAt(j) : ' ';

                // Add the decoration character only if it's not an empty space
                integratedLine.append((decorChar != ' ') ? decorChar : warriorChar);
            }

            warriorLines.set(i, integratedLine.toString());
        }

        // Update the lines of the current decorator
        lines.clear();
        lines.addAll(warriorLines);
    }
}
