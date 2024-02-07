/**
 * Word class that gives the desciption of the words in FlashCards
 * @author abhinavk
 */
public class Word {
    private String word;
    private String type;
    private String definition;
    private String sentence;

    /**
     * Constructor that initializes the word, type, definition, and sentence
     * @param word the word
     * @param type the word's type
     * @param definition the word's definition
     * @param sentence the word in a sentence
     */
    public Word(String word, String type, String definition, String sentence) {
        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;
    }

    /**
     * Method that gets a word
     * @return a word
     */
    public String getWord() {
        return word;
    }

    /**
     * Method that returns a string representation of the description of the word
     * @return the description of the word
     */
    public String getDescription() {
        return "Part of Speech: " + type + "\nDefinition: " + definition + "\n" + sentence;
    }
}
