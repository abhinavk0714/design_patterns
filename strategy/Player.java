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
    }

    public abstract void setDefenceBehavior();
    public abstract void setOffenceBehavior();

    public void play(boolean possesion) {
        // idk what to do here??
    }

    public String toString() {
        return toString();
    }
}
