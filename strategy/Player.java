package strategy;

import java.util.Random;

public abstract class Player {
    private String firstName;
    private String lastName;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    protected Random rand;

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rand = new Random();
    }

    public abstract void setDefenceBehavior();
    public abstract void setOffenceBehavior();

    public String play(boolean possesion) {
        return "did something";
    }

    public String toString() {
        return firstName + " " + lastName + " ";
    }
}
