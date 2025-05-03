import java.util.Scanner;

public class Cycle4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите размер матрицы(длину и ширину): ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.print("\n");

        if (m < 1 || n < 1) {
            System.out.println("Длина и ширина матрицы должны быть не менее 1, программа закрыта...");
            return;
        }

        double [][] matrix = new double [m][n];

        System.out.print("\nВведите элементы матрицы: ");
        int i, j;
        double sum = 0;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("\nПервая строка матрицы после поэлементного умножения на 3: ");

        for (i = 0; i < 1; i++) {
            for (j = 0; j < n; j++) {
                matrix[i][j] *= 3;
                System.out.print("[" + matrix[i][j] + "] ");
            }
        }
    }
}