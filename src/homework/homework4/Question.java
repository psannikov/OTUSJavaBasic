package homework.homework4;

import java.io.IOException;

import static homework.homework4.ServiceFunction.*;

public class Question {
    private String question;
    private Answer[] answers = new Answer[4];

    //Это конструтор для ручного создания запроса
    public Question() throws IOException {
        this.question = getStringWithPrintedText("Введите вопрос");
        for (int i = 0; i < 4; i++) {
            answers[i] = new Answer((i),
                    getStringWithPrintedText("Введите ответ"),
                    Boolean.parseBoolean(getStringWithPrintedText("Укажите является ли он верным (true/false)")));
        }
    }

    //Это конструтор для создания демо тестов
    public Question(String question, Answer[] answers) {
        this.question = question;
        this.answers = answers;
    }

    public void printQuestion() {
        printText("Внимание вопрос");
        printText(this.question);
    }
    public void printAnswers() {
        printText("Варианты ответа");
        for (Answer answer : this.answers) {
            answer.printAnswer();
        }
    }

    public int getCorrectAnswerId() {
        int res = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].getIsCorrectAnswer()) {
                //т.к. нумерация индекса с 0 а пользователь вводит с 1 добавляем +1
                res = i + 1;
            }
        }
        return res;
    }
}
