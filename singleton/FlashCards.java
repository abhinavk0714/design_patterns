import java.util.ArrayList;
import java.util.Random;

/**
 * FlashCards class to create a set of flashcards to study
 * @author abhinavk
 */ 
public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;
    private Word currentWord;

    /**
     * Private constructor that allows for no multiple instances
     */
    private FlashCards() {
        rand = new Random();
        words = FileReader.getWords();
    }

    /**
     * Static method to ensure that there is only one instance of FlashCards
     * @return the flashCards set instance
     */
    public static FlashCards getInstance() {
        if(flashCards == null)
            flashCards = new FlashCards();
        return flashCards;    
    }

    /**
     * Gets a random word from the list of flashcards
     * @return the current word
     */
    public Word getWord() {
        if(words.isEmpty())
            return null;
        currentWord = words.get(rand.nextInt(words.size()));
        return currentWord;
    }
}
