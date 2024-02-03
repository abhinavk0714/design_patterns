package state;

import java.util.ArrayList;

/**
 * The firstgradestate
 * @author abhinavk
 */
public class FirstGradeState extends State {
    /**
     * Constructor that sets the spellinglist to the firstgradestate
     * @param spellingList the spellinglist for first graders
     */
    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        ArrayList<String> firstGradeWords = FileReader.getWords("state/first.txt");
        words = firstGradeWords;
    }

    /**
     * Increases the grade from first grade to second grade
     */
    public void increaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
        System.out.println("Moving to Second Grade...");
    }

    /**
     * Tries to decrease the grade, but cant go below first grade
     */
    public void decreasegrade() {
        spellingList.setState(spellingList.getFirstGradeState());
        System.out.println("You can't go below First Grade...");
    }
}
