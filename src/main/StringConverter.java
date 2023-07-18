package main;

import java.io.IOException;

public class StringConverter {
    private final IOService ioService;
    private int value;
    private final Currencies currency;

    public StringConverter(IOService ioService, Currencies currency) {
        this.ioService = ioService;
        this.currency = currency;
    }

    public void setValueToConvert () throws IOException {
        while (true) {
            int inputValue = ioService.getIntWithPrintedText("Введите число, которое требуется преобразовать в текстовый формат: ");
            if (inputValue > 999999999 && inputValue < 1) {
                ioService.printText("Введенное число невходит в допустимый диапазон [1...999999999]");
                throw new RuntimeException ("Введенное число невходит в допустимый диапазон [1...999999999]");
            } else {
                value = inputValue;
                break;
            }
        }
    }
    public String convertValueToString() {
        int valuePartUnit = value%1000;
        int valuePartKilo = (value%1000_000)/1000;
        int valuePartMega = (value%1000_000_000)/1000_000;
        int[] arrayValue = new int [] {valuePartUnit, valuePartKilo, valuePartMega};
        String valueString = "";
        String string100 = "";
        String string10 = "";
        String string1 = "";
        String currencyString = "";
        String res = "";
        for (int i = arrayValue.length - 1; i >= 0; i--) {
            string100 = switch (arrayValue[i] / 100) {
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
            string10 = switch (arrayValue[i] % 100 / 10) {
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
                    default -> "десять ";
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
                string1 = switch (arrayValue[i] % 10) {
                    case 1 -> switch (i) {
                        case 1 -> "одна ";
                        case 0 -> switch (currency.getGenus()) {
                            case "мужской" -> "один ";
                            case "женский" -> "одна ";
                            case "средний" -> "одно ";
                            default -> "";
                        };
                        default -> "один ";
                    };
                    case 2 -> switch (i) {
                        case 1 -> "две ";
                        case 0 -> switch (currency.getGenus()) {
                            case "мужской","средний" -> "два ";
                            case "женский" -> "две ";
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
                    valueString = switch (i) {
                        case 1 -> "тысяча ";
                        case 2 -> "миллион ";
                        default -> "";
                    };
                } else if (((arrayValue[i] % 10 == 2) || (arrayValue[i] % 10 == 3) || (arrayValue[i] % 10 == 4)) &&
                        ((arrayValue[i] % 100 < 10) || (arrayValue[i] % 100 > 20))) {
                    valueString = switch (i) {
                        case 1 -> "тысячи ";
                        case 2 -> "миллиона ";
                        default -> "";
                    };
                } else {
                    valueString = switch (i) {
                        case 1 -> "тысяч ";
                        case 2 -> "миллионов ";
                        default -> "";
                    };
                }
                System.out.println(res);
                res += string100 + string10 + string1 + valueString;
            }
        }
        if (currency.isChanged()) {
            currencyString = switch (arrayValue[0] % 10) {
                case 1 -> currency.getNominativeCase();
                case 2, 3, 4 -> currency.getGenitiveSingular();
                default -> currency.getGenitivePlural();
            };
        } else {
            currencyString = currency.getName();
        }
        return res + currencyString;
    }
}
