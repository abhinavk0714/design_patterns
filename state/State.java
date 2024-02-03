package state;

import java.util.ArrayList;
import java.util.Random;

/**
 * Abstract State class
 * @author abhinavk
 */
public abstract class State {
    protected SpellingList spellingList;
    protected ArrayList<String> words;
    private Random rand;

    /**
     * Constructor that sets up the spellinglist, words, and randomness
     * @param spellingList the spellinglist of words
     */
    public State(SpellingList spellingList) {
        this.spellingList = spellingList;
        this.words = new ArrayList<>();
        this.rand = new Random();
    }

    /**
     * Method to get next word of the words arraylist
     * @return returns a random word
     */
    public String getNextWord() {
        if (words != null && !words.isEmpty()) {
            int randomIndex = rand.nextInt(words.size());
            return words.get(randomIndex);
        } else {
            return null; // Handle the case if the list is empty.
        }
    }

    /*
     * Abstract method to increase grade
     */
    public abstract void increaseGrade();

    /**
     * Abstract method to decrease grade
     */
    public abstract void decreasegrade();
}
