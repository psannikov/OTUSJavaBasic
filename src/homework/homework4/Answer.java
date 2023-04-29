package homework.homework4;

import static homework.homework4.ServiceFunction.printText;

public class Answer {
    private int answerId;
    private String answer;
    private boolean isCorrectAnswer;
    public Answer(int answerId, String answer, boolean isCorrectAnswer) {
        this.answerId = answerId;
        this.answer = answer;
        this.isCorrectAnswer = isCorrectAnswer;
    }
    void printAnswer() {
        printText(this.answerId + ". " + this.answer);
    }
    boolean getIsCorrectAnswer () {
        return this.isCorrectAnswer;
    }
}
