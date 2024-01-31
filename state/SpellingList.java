package state;

public class SpellingList {
    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;

    public SpellingList() {
        firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);
        
        // Set the initial state to First Grade
        state = firstGradeState;
    }

    public String getNextWord() {
        return state.getNextWord();
    }

    public void increaseGrade() {
        state.increaseGrade();
    }

    public void decreaseGrade() {
        state.decreasegrade();
    }

    public State getFirstGradeState() {
        return firstGradeState;
    }

    public State getSecondGradeState() {
        return secondGradeState;
    }

    public State getThirdGradeState() {
        return thirdGradeState;
    }

    public void setState(State state) {
        this.state = state;
    }
}
