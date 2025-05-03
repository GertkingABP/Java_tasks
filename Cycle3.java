import java.util.Scanner;

public class Cycle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите размер массива: ");
        int size = scanner.nextInt();
        System.out.print("\n");

        if (size < 1) {
            System.out.println("Размер массива должен быть не менее 1, программа закрыта...");
            return;
        }

        double [] massive = new double [size];

        System.out.print("\nВведите элементы массива: ");
        int i;
        double sum = 0;
        for (i = 0; i < size; i++) {
            massive[i] = scanner.nextDouble();
            sum += massive[i];
        }

        double average = sum / size;

        System.out.print("\nМассив после умножения каждого элемента на среднее арифметическое: ");
        i = 0;
        while (i < size) {
            System.out.print(massive[i] * average + " ");
            i++;
        }
    }
}