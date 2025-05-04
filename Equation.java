import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.print("\nВвод: ");
            String equation = scanner.next();
            System.out.print("\n");

            if (equation.length() != 5) {
                System.out.println("Уравнение должно состоять из 5 символов");
                return;
            }

            if (equation.matches("^([x\\d])([+-])([x\\d])=([x\\d])$")) {
                char[] chars = equation.toCharArray();
                int answer = 0;
                boolean xAt0 = chars[0] == 'x';
                boolean xAt2 = chars[2] == 'x';
                boolean xAt4 = chars[4] == 'x';

                try {
                    if (xAt0 && xAt2) {
                        // Случаи x+x= или x-x=
                        int right = Character.getNumericValue(chars[4]);
                        if (chars[1] == '+') {
                            answer = right / 2;
                        }

                        else { // x-x=c
                            if (right == 0) {
                                System.out.println("Вывод: x любое");
                            }
                            else {
                                System.out.println("Вывод: нет решения");
                            }
                            continue;
                        }
                    }

                    else if (xAt0) {
                        // Случаи x+ или x-
                        int b = Character.getNumericValue(chars[2]);
                        int c = Character.getNumericValue(chars[4]);
                        answer = chars[1] == '+' ? c - b : c + b;
                    }

                    else if (xAt2) {
                        // Случаи +x или -x
                        int a = Character.getNumericValue(chars[0]);
                        int c = Character.getNumericValue(chars[4]);
                        answer = chars[1] == '+' ? c - a : a - c;
                    }

                    else if (xAt4) {
                        // Случаи =x
                        int a = Character.getNumericValue(chars[0]);
                        int b = Character.getNumericValue(chars[2]);
                        answer = chars[1] == '+' ? a + b : a - b;
                    }

                    System.out.println("Вывод: " + answer);
                }

                catch (NumberFormatException e) {
                    System.out.println("Ошибка преобразования числа");
                }
            }

            else {
                System.out.println("Уравнение введено некорректно");
                run = false;
            }
        }
        scanner.close();
    }
}