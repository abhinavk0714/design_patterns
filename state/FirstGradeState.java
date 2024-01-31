package state;

import java.util.ArrayList;

public class FirstGradeState extends State {
    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        ArrayList<String> firstGradeWords = FileReader.getWords("state/first.txt");
        words = firstGradeWords;
    }

    public void increaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
    }

    public void decreasegrade() {
        spellingList.setState(spellingList.getFirstGradeState());
    }
}
