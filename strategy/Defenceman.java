package strategy;

public class Defenceman extends Player {

    public Defenceman(String firstName, String lastName) {
        super(firstName, lastName);
        setDefenceBehavior();
        setOffenceBehavior();
    }

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

    public void setDefenceBehavior() {
        int randomNumber4 = rand.nextInt(2);
        
        if(randomNumber4 == 0)
            defenceBehavior = new ChasePuckBehavior();
        else
            defenceBehavior = new BlockBehavior();
    }

    public String toString() {
        return super.toString() + "plays the position: Defenceman";
    }

}
