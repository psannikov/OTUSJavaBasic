package homework.homework4;

import java.io.IOException;

import static homework.homework4.ServiceFunction.*;
import homework.homework4.Answer.*;

public class Question {
    private int questionId;
    private String question;
    private Answer[] answers = new Answer[4];

    //Это конструтор для ручного создания запроса
    public Question() throws IOException {
        this.questionId = (Integer.parseInt(getStringWithPrintedText("Введите номер вопроса")));
        this.question = getStringWithPrintedText("Введите вопрос");
        for (int i = 0; i < 4; i++) {
            answers[i] = new Answer((i),
                    getStringWithPrintedText("Введите ответ"),
                    Boolean.parseBoolean(getStringWithPrintedText("Укажите является ли он верным (true/false)")));
        }
    }

    //Это конструтор для создания демо тестов
    public Question(int questionId, String question, Answer[] answers) {
        this.questionId = questionId;
        this.question = question;
        this.answers = answers;
    }

    public void printQuestion() {
        printText(this.question);
    }

    public int getCorrectAnswerId() {
        int res = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].getIsCorrectAnswer()) {
                res = i;
            }
        }
        return res;
    }
}
