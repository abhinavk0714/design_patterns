package strategy;

import java.util.Random;

public class BlockBehavior implements DefenceBehavior {
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
