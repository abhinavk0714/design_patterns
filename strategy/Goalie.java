package strategy;

/**
 * Goalie for the hockey team
 */
public class Goalie extends Player {
    /**
     * Constructor that creates a new goalie player and sets their initial behaviors
     * @param firstName the firstname of the player
     * @param lastName the lastname of the player
     */
    public Goalie(String firstName, String lastName) {
        super(firstName, lastName);
        setDefenceBehavior();
        setOffenceBehavior();
    }

    /**
     * Sets the offencebehavior to always block the goal
     */
    public void setOffenceBehavior() {
        offenceBehavior = new BlockGoalBehavior();
    }

    /**
     * Sets the defencebehavior to always block the goal
     */
    public void setDefenceBehavior() {
        defenceBehavior = new BlockGoalBehavior();
    }

    /**
     * Creates a string representation of the player and thier position
     * @return returns this string
     */
    public String toString() {
        return super.toString() + "plays the position: Goalie";
    }
}
