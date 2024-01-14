package strategy;

/**
 * Forward for the hockey team
 */
public class Forward extends Player {
    /**
     * Constructor that creates a new forward player and sets their initial behaviors
     * @param firstName the firstname of the player
     * @param lastName the lastname of the player
     */
    public Forward(String firstName, String lastName) {
        super(firstName, lastName);
        setDefenceBehavior();
        setOffenceBehavior();
    }

    /**
     * Sets the offencebehavior to 50% passing and 50% shooting
     */
    public void setOffenceBehavior() {
        int randomNumber1 = rand.nextInt(2);
        if(randomNumber1 == 0)
            offenceBehavior = new PassBehavior();
        else
            offenceBehavior = new ShootBehavior();
    }

    /**
     * Sets the defencebehavior to 50% chasing the puck and 50% blocking
     */
    public void setDefenceBehavior() {
        int randomNumber2 = rand.nextInt(2);
        if(randomNumber2 == 0)
            defenceBehavior = new ChasePuckBehavior();
        else
            defenceBehavior = new BlockBehavior();       
    }

    /**
     * Creates a string representation of the player and thier position
     * @return returns this string
     */
    public String toString() {
        return super.toString() + "plays the position: Forward";
    }
}
