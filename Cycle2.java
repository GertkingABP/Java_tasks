import java.util.Scanner;

public class Cycle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите число: ");
        int n = scanner.nextInt();
        System.out.print("\n");

        if (n < 1) {
            System.out.println("Число должно быть не менее 1, программа закрыта...");
            return;
        }

        System.out.println("\nНечетные числа с 1 до введенного тобой: ");
        int i;
        if (n == 1) {
            i = 1;
            System.out.println(i);
            return;
        }
        for (i = 1; i < n; i = i + 2) {
            System.out.println(i);
        }

        System.out.print("\n");
    }
}