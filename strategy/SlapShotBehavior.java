package strategy;

/**
 * Slap shot behavior for players
 */
public class SlapShotBehavior implements OffenceBehavior {
    /**
     * Play returns a string descibing the play made
     * @return returns the play
     */
    public String play() {
        return "Shoots the puck from the blue line";
    }
}
