package state;

import java.util.ArrayList;

/**
 * The thirdgradestate
 * @author abhinavk
 */
public class ThirdGradeState extends State {
    /**
     * Constructor that sets the spellinglist to thirdgradestate
     * @param spellingList the spellinglist for third graders
     */
    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        ArrayList<String> thirdGradeWords = FileReader.getWords("state/third.txt");
        words = thirdGradeWords;
    }

    /**
     * Tries to increase the grade, but cannot go above third grade
     */
    public void increaseGrade() {
        spellingList.setState(spellingList.getThirdGradeState());
        System.out.println("Sorry, we currently only have up to third grade in our system...");
    }

    /**
     * Decreases the grade from third grade to second grade
     */
    public void decreasegrade() {
        spellingList.setState(spellingList.getSecondGradeState());
        System.out.println("Moving to Second Grade...");

    }
}
