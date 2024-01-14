package strategy;

/**
 * Defenceman for the hockey team
 */
public class Defenceman extends Player {
    /**
     * Constructor that creates a new defenceman player and sets their initial behaviors
     * @param firstName the firstname of the player
     * @param lastName the lastname of the player
     */
    public Defenceman(String firstName, String lastName) {
        super(firstName, lastName);
        setDefenceBehavior();
        setOffenceBehavior();
    }

    /**
     * Sets the offencebehavior to 90% of the time passing and 10% slap shooting
     */
    public void setOffenceBehavior() {
        // Generate a random number between 0 and 99
        int randomNumber3 = rand.nextInt(100);

        // 90% of the time set offense behavior to "pass behavior"
        if(randomNumber3 < 90)
            offenceBehavior = new PassBehavior();
        else
        // 10% of the time set offense behavior to "slap shot behavior"
            offenceBehavior = new SlapShotBehavior();
    }

    /**
     * Sets the defencebehavior to 50% chasing the puck and 50% blocking
     */
    public void setDefenceBehavior() {
        int randomNumber4 = rand.nextInt(2);
        
        if(randomNumber4 == 0)
            defenceBehavior = new ChasePuckBehavior();
        else
            defenceBehavior = new BlockBehavior();
    }

    /**
     * Creates a string representation of the player and thier position
     * @return returns this string
     */
    public String toString() {
        return super.toString() + "plays the position: Defenceman";
    }

}
