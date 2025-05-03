import java.util.Scanner;

public class Cycle1 {
    public static void main(String[] args) {
        int x = 4;
        int y = 8;
        int z = 194;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите размер массива: ");
        int size = scanner.nextInt();
        System.out.print("\n");

        if (size < 1) {
            System.out.println("Размер массива должен быть не менее 1, программа закрыта...");
            return;
        }

        int [] massive = new int [size];

        System.out.print("\nВведите элементы массива: ");
        int i;
        for (i = 0; i < size; i++) {
            massive[i] = scanner.nextInt();
        }

        i = 0;
        while (i < size) {
            if (massive[i] == x || massive[i] == y || massive[i] == z) {
                System.out.print("\nДанное значение имеется в константах (" + massive[i] + ")");
            }
            i++;
        }
    }
}