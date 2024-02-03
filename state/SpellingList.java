package state;

/**
 * Creates a spellinglist that utilizes state
 * @author abhinavk
 */
public class SpellingList {
    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;

    /**
     * Constructor that initializes first, second, and third grade states and sets the initial state to firstGrade
     */
    public SpellingList() {
        firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);
        
        // Set the initial state to firstGrade
        state = firstGradeState;
    }

    /**
     * Implements the getNextWord method from State
     * @return the next word
     */
    public String getNextWord() {
        return state.getNextWord();
    }

    /**
     * Increases the grade
     */
    public void increaseGrade() {
        state.increaseGrade();
    }

    /**
     * Decreases the grade
     */
    public void decreaseGrade() {
        state.decreasegrade();
    }

    /**
     * Gets the firstgradestate
     * @return the firstgradestate
     */
    public State getFirstGradeState() {
        return firstGradeState;
    }

    /**
     * Gets the secondgradestate
     * @return the secondgradestate
     */
    public State getSecondGradeState() {
        return secondGradeState;
    }

    /**
     * Gets the thirdgradestate
     * @return the thirdgradestate
     */
    public State getThirdGradeState() {
        return thirdGradeState;
    }

    /**
     * Sets the state
     * @param state the state
     */
    public void setState(State state) {
        this.state = state;
    }
}
