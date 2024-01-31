package state;

import java.util.ArrayList;

public class SecondGradeState extends State {
    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
        ArrayList<String> secondGradeWords = FileReader.getWords("state/second.txt");
        words = secondGradeWords;
    }

    public void increaseGrade() {
        spellingList.setState(spellingList.getThirdGradeState());
    }

    public void decreasegrade() {
        spellingList.setState(spellingList.getFirstGradeState());
    }
}
