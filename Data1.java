import java.util.Scanner;

public class Data1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите первое число: ");
        int number1 = scanner.nextInt();
        String strNumber = String.valueOf(number1);
        System.out.print("\n");
        System.out.print("\nВведите второе число: ");
        int number2 = scanner.nextInt();
        Integer intNumber = Integer.valueOf(number2);
        System.out.print("\n");

        double doubleNumber;
        if (number1 > number2) {
            System.out.println(number1);
            doubleNumber = Double.valueOf(number2);
        }

        else if (number1 < number2) {
            System.out.println(number2);
            doubleNumber = Double.valueOf(number1);
        }

        else {
            System.out.println("Числа равны или вы ввели что-то другое, программа закрыта...");
            return;
        }

        System.out.println(doubleNumber);
    }
}