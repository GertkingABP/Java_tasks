import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите x: ");
        double x = scanner.nextDouble();
        System.out.print("\nВведите y: ");
        double y = scanner.nextDouble();
        System.out.print("\nВведите z: ");
        double z = scanner.nextDouble();
        System.out.println("\nВаши числа: x=" + x + ", y=" + y + ", z=" + z);

        double average = (x + y + z) / 3.0;
        System.out.println("\nСреднее арифметическое: " + average);

        double drobed = average / 2;
        int result;
        if (drobed >= 0) {
            result = (int) drobed;
        }
        else {
            result = (drobed == (int) drobed) ? (int) drobed : (int) drobed - 1;
        }
        System.out.println("\nРезультат деления на 2 с округлением вниз: " + result);

        if (result > 3) {
            System.out.println("\nПрограмма выполнена корректно");
        }
        System.out.println("\n");
    }
}
