package homework.homework4;

import java.io.IOException;

import static homework.homework4.ServiceFunction.*;

public class Test {
    public static void main(String[] args) throws IOException {
        Question[] questionsForTet = new Question[3];
        int countRightAnswer = 0;
        //TODO сделать режим работы программы демо или ручные тесты, мб сделаю а мб и нет
        questionsForTet[0] = new Question("Куда идем мы с Пятачком?",
                new Answer[]{new Answer(1, "На юг", false),
                        new Answer(2, "На север", false),
                        new Answer(3, "Большой секрет", false),
                        new Answer(4, "Большой-большой секрет", true)});
        questionsForTet[1] = new Question("Куда убил Марка?",
                new Answer[]{new Answer(1, "Мер", false),
                        new Answer(2, "Не важно", true),
                        new Answer(3, "Алиса", false),
                        new Answer(4, "Прихвотсни мера", false)});
        questionsForTet[2] = new Question("Одним из направлений какой религиозной философии является учение Дзен?",
                new Answer[]{new Answer(1, "Буддизм", true),
                        new Answer(2, "Даосизм", false),
                        new Answer(3, "Индуизм", false),
                        new Answer(4, "Иудаизм", false)});
        printText("Вам предлагается пройти тест.\nПравильный вариант ответа всегда один\nВыбирите ответ и введите его номер\n\n");
        for (Question question: questionsForTet) {
            int userAnswerId;
            question.printQuestion();
            question.printAnswers();
            userAnswerId = Integer.parseInt(getStringWithPrintedText("Введите ваш вариант ответа: "));
            if (userAnswerId == question.getCorrectAnswerId()) {
                printText("Это правильный вариант овтета");
                countRightAnswer ++;
            } else {
                printText("Это неверный ответ");
            }
        }
        printText("Тест завершен");
        printText("Правильных овтетов: ", String.valueOf(countRightAnswer));
        printText("Неправильных овтетов: ", String.valueOf(questionsForTet.length -  countRightAnswer));
    }
}
