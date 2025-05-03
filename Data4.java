import java.util.Random;

public class Data4 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] massive = new int[15];
        int i;
        for (i = 0; i < 15; i++) {
            massive[i] = random.nextInt(-20, 20);
        }

        System.out.print("\nМассив случайных элементов: ");
        for (i = 0; i < 15; i++) {
            System.out.print("[" + massive[i] + "] ");
        }

        int maxNum = massive[0];
        int minNum = massive[0];
        for (i = 0; i < 15; i++) {
            if (maxNum < massive[i]) {maxNum = massive[i];}
            if (minNum > massive[i]) {minNum = massive[i];}
        }
        
        System.out.print("\nМаксимальный элемент массива: " + maxNum);
        System.out.print("\nМинимальный элемент массива: " + minNum);
        System.out.print("\nМаксимальное по модулю число из минимума и максимума: " + Math.max(Math.abs(maxNum), Math.abs(minNum)));
    }
}