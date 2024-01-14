package strategy;

/**
 * Pass behavior for players
 */
public class PassBehavior implements OffenceBehavior {
    /**
     * Play returns a string descibing the play made
     * @return returns the play
     */
    public String play() {
        return "Passes to a forward";
    }
}
