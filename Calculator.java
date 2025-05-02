import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nВведите x(первое число): ");
        double x = scanner.nextDouble();
        System.out.print("\n");
        System.out.print("Введите операцию (+, -, *, /): ");
        String operation = scanner.next();
        System.out.print("\n");
        System.out.print("\nВведите y(второе число): ");
        double y = scanner.nextDouble();
        System.out.print("\n");

        double result;

        if (operation.equals("+")) {
            result = x + y;
        }
        else if (operation.equals("-")) {
            result = x - y;
        }
        else if (operation.equals("*")) {
            result = x * y;
        }
        else if (operation.equals("/")) {
            result = x / y;
        }
        else {
            System.out.println("Вы ввели что-то другое, программа закрыта...");
            return;
        }

        System.out.println("\nРезультат: " + result);
    }
}