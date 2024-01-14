package strategy;

import java.util.Random;
/**
 * Block goal behavior for players (goalie)
 */
public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {
    /**
     * Creates a bunch of messages to display for the play
     * @return prints a message at random from the string of messages
     */
    public String play() {
        // Array of messages
        String[] messages = {
            "hand blocks the puck",
            "catches the puck",
            "blocks puck with knee pads",
            "blocks puck with stick"
        };

        // Create a Random object
        Random random = new Random();

        // Generate a random index to select a message
        int randomIndex = random.nextInt(messages.length);

        // Print the selected message
        return (messages[randomIndex]);
    }
}
