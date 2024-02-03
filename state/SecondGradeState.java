package state;

import java.util.ArrayList;

/**
 * The secondgradestate
 * @author abhinavk
 */
public class SecondGradeState extends State {
    /**
     * Constructor that sets the spellinglist to the secondgradestate
     * @param spellingList the spellinglist for second graders
     */
    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
        ArrayList<String> secondGradeWords = FileReader.getWords("state/second.txt");
        words = secondGradeWords;
    }

    /**
     * Increases the grade from second grade to third grade
     */
    public void increaseGrade() {
        spellingList.setState(spellingList.getThirdGradeState());
        System.out.println("Moving to Third Grade...");
    }

    /**
     * Decreases the grade from second grade to first grade
     */
    public void decreasegrade() {
        spellingList.setState(spellingList.getFirstGradeState());
        System.out.println("Moving to First Grade...");
    }
}
