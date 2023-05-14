package homework.homework3;

import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[][] questions = {{"Куда идем мы с Пятачком?", "На север", "Юг", "Большой секрет", "Большой-большой секрет"},
                {"Кто убил Марка?", "Мэр", "Не важно", "Прихвостни мэра"},
                {"Какое растение существует на самом деле?","Лох чилийский","Лох индийский","Лох греческий","Лох русский"}};
        int correctAnswer = 0;
        System.out.println("Добрый день! Сейчас Вам будет предложено пройти небольшой тест");
        System.out.print("Если вы готовы введите ДА и нажмите Enter: ");
        String answStart = scan.nextLine();
        System.out.println("\n".repeat(30));
        if (answStart.equalsIgnoreCase("да")) {
            System.out.println("Вы согласились пройти тест. Вам будет предложен вопрос и варианты ответов");
            System.out.println("Вам необходимо выбрать верный вариант и вписать его после чего нажать Enter");
            for (int i = 0; i < questions.length; i++) {
                System.out.println("Вопрос № " +  (i+1));
                System.out.println(questions[i][0]);
                System.out.println("Варианты овтета:");
                for (int x = 1; x < questions[i].length; x++) {
                    System.out.println(x +". " + questions[i][x]);
                }
                System.out.print("Введите ваш ответ: ");
                answStart = scan.nextLine();
                System.out.println("i="+i+" answStart="+answStart);
                if ((i == 0 && answStart.equals("Большой-большой секрет") ||
                        (i == 1 && answStart.equals("Не важно"))) ||
                        (i == 2 && answStart.equals("Лох индийский"))) {
                    correctAnswer ++;
                }
                System.out.println("\n".repeat(30));
            }
            System.out.println("Поздравляю вы закончили тест");
            System.out.println("Количество правильных ответо - " + correctAnswer);
        } else {
            System.out.println("Вы отказались от прохождения теста. Досвидание");
        }
    }
}
