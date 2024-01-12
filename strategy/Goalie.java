import strategy.BlockGoalBehavior;
import strategy.OffenceBehavior;
import strategy.Player;

public class Goalie extends Player {

    public Goalie(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setOffenceBehavior() {
        offenceBehavior = new BlockGoalBehavior();
    }

    public void setDefenceBehavior() {
        defenceBehavior = new BlockGoalBehavior();
    }

    public String toString() {
        return "plays the position: Goalie";
    }
}
