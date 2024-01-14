package strategy;

/**
 * Chase puck behavior for players
 */
public class ChasePuckBehavior implements DefenceBehavior {
    /**
     * Play returns a string descibing the play made
     * @return returns the play
     */
    public String play() {
        return "Chases the puck";
    }
}
