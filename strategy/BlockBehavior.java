package strategy;

import java.util.Random;
/**
 * Block behavior for players
 */
public class BlockBehavior implements DefenceBehavior {
    /**
     * Creates a bunch of messages to display for the play
     * @return prints a message at random from the string of messages
     */
    public String play() {
        // Array of messages
        String[] messages = {
        "blocks player from passing",
        "blocks player from shooting",
        "checks player with puck"
        };

        // Create a Random object
        Random random = new Random();
        
        // Generate a random index to select a message
        int randomIndex = random.nextInt(messages.length);
        
        // Print the selected message
        return (messages[randomIndex]);
    }
}
