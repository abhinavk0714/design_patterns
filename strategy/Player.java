package strategy;

import java.util.Random;

/**
 * An abstract player class for the team
 */
public abstract class Player {
    private String firstName;
    private String lastName;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    protected Random rand;

    /**
     * Constructor for creating a new player
     * @param firstName the firstname of the player
     * @param lastName the lastname of the player
     */
    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rand = new Random();
    }

    public abstract void setDefenceBehavior();
    public abstract void setOffenceBehavior();

    /**
     * String that returns the play based on the possesion of the puck
     * @param possesion does the team have the puck or not
     * @return returns the play after setting the behaviors to provide the randomness described in the behaviors
     */
    public String play(boolean possesion) {
        if(possesion = true) {
            setOffenceBehavior();
            return offenceBehavior.play();
        } else {
            setDefenceBehavior();
            return defenceBehavior.play();
        }   
    }

    /**
     * Creates a string representation of the player name
     * @return A string versino of the player name
     */
    public String toString() {
        return firstName + " " + lastName + " ";
    }
}
