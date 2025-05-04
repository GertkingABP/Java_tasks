import java.util.Scanner;

public class ConverterMoney {
    public static void main(String[] args) {
        boolean run = true;
        float valueCourse, rubValue;
        Scanner scanner = new Scanner(System.in);

        while (run == true) {
            try {
                System.out.print("\n");
                System.out.print("Курс доллара: ");
                valueCourse = scanner.nextFloat();
                System.out.print("\n");
                System.out.print("Количество рублей: ");
                rubValue = scanner.nextFloat();
                System.out.print("\n");
                float usdResult = rubValue / valueCourse;
                System.out.printf("Итого: %.2f", usdResult);
                System.out.print("\n");
            }

            catch (Exception e) {
                System.err.println("Произошла ошибка: " + e.getMessage());
                e.printStackTrace();
            }

            System.out.print("\n");
            System.out.print("Хотите продолжить(1 - да, другое - выйти из программы)? ");
            String answer = scanner.next();

            if (answer.equals("1")) {
                System.out.print("\n");
                System.out.print("Хорошо, продолжаем.");
                System.out.print("\n");
            }

            else  {
                System.out.print("\n");
                System.out.print("Выход из программы...");
                System.out.print("\n");
                run = false;
            }
        }
    }
}