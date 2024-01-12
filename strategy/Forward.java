import strategy.BlockBehavior;
import strategy.ChasePuckBehavior;
import strategy.PassBehavior;
import strategy.Player;
import strategy.ShootBehavior;

public class Forward extends Player {

    public Forward(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setOffenceBehavior() {
        int randomNumber1 = rand.nextInt(2);
        if(randomNumber1 == 0)
            offenceBehavior = new PassBehavior();
        else
            offenceBehavior = new ShootBehavior();
    }

    public void setDefenceBehavior() {
        int randomNumber2 = rand.nextInt(2);
        if(randomNumber2 == 0)
            defenceBehavior = new ChasePuckBehavior();
        else
            defenceBehavior = new BlockBehavior();       
    }

    public String toString() {
        return "plays the position: Forward";
    }
}
