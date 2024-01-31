package state;

import java.util.ArrayList;

public class ThirdGradeState extends State {
    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        ArrayList<String> thirdGradeWords = FileReader.getWords("state/third.txt");
        words = thirdGradeWords;
    }

    public void increaseGrade() {
        spellingList.setState(spellingList.getThirdGradeState());
    }

    public void decreasegrade() {
        spellingList.setState(spellingList.getSecondGradeState());
    }
}
