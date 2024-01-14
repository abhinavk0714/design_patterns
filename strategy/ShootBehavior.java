package strategy;

/**
 * Shoot behavior for players
 */
public class ShootBehavior implements OffenceBehavior {
    /**
     * Play returns a string descibing the play made
     * @return returns the play
     */
    public String play() {
        return "Shoots at the goal";
    }
}
