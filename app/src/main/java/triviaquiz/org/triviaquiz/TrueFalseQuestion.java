package triviaquiz.org.triviaquiz;

/**
 * Created by Chaz on 2/3/2015.
 */
public class TrueFalseQuestion {
    //mQuestion is the resource ID(an int), not the actual string
    private int mQuestion;

    //mTrueQuestion is true, if the question is true, false if the question is false
    private boolean mTrueQuestion;

    //Constructor
    public TrueFalseQuestion(int question, boolean trueQuestion){
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(final int question) {
        mQuestion = question;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(final boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }
}
