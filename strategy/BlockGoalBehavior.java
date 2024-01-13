package strategy;
// import java.util.random;
public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {
    public String play() {
        return "catches the puck";
        // Array of messages
        // String[] messages = {
        //     "hand blocks the puck",
        //     "catches the puck",
        //     "blocks puck with knee pads",
        //     "blocks puck with stick"
        // };

        // // Create a Random object
        // Random random = new Random();

        // // Generate a random index to select a message
        // int randomIndex = random.nextInt(messages.length);

        // // Print the selected message
        // System.out.println(messages[randomIndex]);
    }
}
