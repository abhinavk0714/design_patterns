package state;

import java.util.ArrayList;
import java.util.Random;

public abstract class State {
    protected SpellingList spellingList;
    protected ArrayList<String> words;
    private Random rand;

    public State(SpellingList spellingList) {
        this.spellingList = spellingList;
        this.words = new ArrayList<>();
        this.rand = new Random();
    }

    public String getNextWord() {
        if (words != null && !words.isEmpty()) {
            int randomIndex = rand.nextInt(words.size());
            return words.get(randomIndex);
        } else {
            return null; // Handle the case when the list is empty.
        }
    }

    public abstract void increaseGrade();
    public abstract void decreasegrade();
}
