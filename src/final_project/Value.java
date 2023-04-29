package final_project;

import java.util.Scanner;

public class Value {
    int value;
    Currency currency;
    public Value(Currency currency) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, которое требуется преобразовать в текстовый формат: ");
        value = scanner.nextInt();
        this.currency = currency;
        //TODO добавить обработчик исключений
        //TODO подумать как вводить числа больше int
    }
    public String convertValueToString () {
        int[] arrayValue = new int[4];
        arrayValue[3] = value/1000_000_000;
        arrayValue[2] = (value%1000_000_000)/1000_000;
        arrayValue[1] = (value%1000_000)/1000;
        arrayValue[0] = value%1000;
        String valStr = "";
        String str100 = "";
        String str10 = "";
        String str1 = "";
        String currencyStr = "";
        String res = "";
        for (int i = arrayValue.length - 1; i >= 0; i--) {
            str100 = switch (arrayValue[i] / 100) {
                case 1 -> "сто ";
                case 2 -> "двести ";
                case 3 -> "триста ";
                case 4 -> "четыреста ";
                case 5 -> "пятьсот ";
                case 6 -> "шестьсот ";
                case 7 -> "семьсот ";
                case 8 -> "восемьсот ";
                case 9 -> "деватьсот ";
                default -> "";
            };
            str10 = switch (arrayValue[i] % 100 / 10) {
                case 1 -> switch (arrayValue[i] % 10) {
                    case 1 -> "одинадцать ";
                    case 2 -> "двенадцать ";
                    case 3 -> "тринадцать ";
                    case 4 -> "четырнадцать ";
                    case 5 -> "пятьнадцать ";
                    case 6 -> "шестьнадцать ";
                    case 7 -> "семнадцать ";
                    case 8 -> "восемнадцать ";
                    case 9 -> "девятнадцать ";
                    default -> "";
                };
                case 2 -> "двадцать ";
                case 3 -> "тридцать ";
                case 4 -> "сорок ";
                case 5 -> "пятьдесят ";
                case 6 -> "шестьдесят ";
                case 7 -> "семьдесят ";
                case 8 -> "восемьдесят ";
                case 9 -> "девяносто ";
                default -> "";
            };
            if ((arrayValue[i] < 11) || (arrayValue[i] > 20)) {
                str1 = switch (arrayValue[i] % 10) {
                    case 1 -> switch (i) {
                        case 1 -> "одна ";
                        case 0 -> switch (currency.currencyData[2]) {
                            case "мужской" -> "один";
                            case "женский" -> "одна";
                            case "средний" -> "одно";
                            default -> "";
                        };
                        default -> "один ";
                    };
                    case 2 -> switch (i) {
                        case 1 -> "две ";
                        case 0 -> switch (currency.currencyData[2]) {
                            case "мужской" -> "два ";
                            case "женский" -> "две ";
                            case "средний" -> "два ";
                            default -> "";
                        };
                        default -> "два ";
                    };
                    case 3 -> "три ";
                    case 4 -> "четыре ";
                    case 5 -> "пять ";
                    case 6 -> "шесть ";
                    case 7 -> "семь ";
                    case 8 -> "восемь ";
                    case 9 -> "девять ";
                    default -> "";
                };
            }
            if (arrayValue[i] > 0) {
                if ((arrayValue[i] % 10 == 1) && ((arrayValue[i] % 100 < 10) || (arrayValue[i] % 100 > 20))) {
                    valStr = switch (i) {
                        case 1 -> "тысяча ";
                        case 2 -> "миллион ";
                        case 3 -> "миллиард ";
                        default -> "";
                    };
                } else if (((arrayValue[i] % 10 == 2) || (arrayValue[i] % 10 == 3) || (arrayValue[i] % 10 == 4)) &&
                        ((arrayValue[i] % 100 < 10) || (arrayValue[i] % 100 > 20))) {
                    valStr = switch (i) {
                        case 1 -> "тысячи ";
                        case 2 -> "миллиона ";
                        case 3 -> "миллиарда ";
                        default -> "";
                    };
                } else {
                    valStr = switch (i) {
                        case 1 -> "тысяч ";
                        case 2 -> "миллионов ";
                        case 3 -> "миллиардов ";
                        default -> "";
                    };
                }
                res += str100 + str10 + str1 + valStr;
            }
        }
        currencyStr = switch (currency.currencyData[1]) {
            case "нет" -> currency.currencyData[0];
            case "да" -> switch (arrayValue[0] % 10) {
                case 1 -> currency.currencyData[3];
                case 2, 3, 4 -> currency.currencyData[4];
                default -> currency.currencyData[5];
            };
            default -> "";
        };
        return res + currencyStr;
    }
}
