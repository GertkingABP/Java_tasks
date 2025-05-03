import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nВыберите, что переводить: 1 - масса, 2 - расстояние ");
        int type = scanner.nextInt();
        System.out.print("\n");

        if (type == 1) {
            System.out.print("Выберите единицу измерения: 1 - килограмм, 2 - унция, 3 - карат ");
            int massType = scanner.nextInt();
            System.out.print("\n");

            System.out.print("Введите число: ");
            double massValue = scanner.nextDouble();
            System.out.print("\n");
            double kgResult, uncResult, karatResult;

            if (massType == 1) {
                kgResult = massValue;
                uncResult = massValue * 35.270000D;
                karatResult = massValue * 5000D;
            }

            else if (massType == 2) {
                uncResult = massValue;
                kgResult = massValue * 0.028350D;
                karatResult = massValue * 141.750000D;
            }

            else if (massType == 3) {
                karatResult = massValue;
                kgResult = massValue * 0.000200D;
                uncResult = massValue * 0.007055D;
            }

            else {
                System.out.println("Вы ввели что-то другое, программа закрыта...");
                return;
            }

            System.out.print("Результат:\nКилограммы: " + kgResult + "\nУнции: " + uncResult + "\nКараты: " + karatResult);
        }

        else if (type == 2) {
            System.out.print("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут ");
            int distanceType = scanner.nextInt();
            System.out.print("\n");

            System.out.print("Введите число: ");
            double distanceValue = scanner.nextDouble();
            System.out.print("\n");
            double meterResult, mileResult, yardResult, ftResult;

            if (distanceType == 1) {
                meterResult = distanceValue;
                mileResult = distanceValue * 0.000621D;
                yardResult = distanceValue * 1.090000D;
                ftResult = distanceValue * 3.280000D;
            }

            else if (distanceType == 2) {
                mileResult = distanceValue;
                meterResult = distanceValue * 1609.340000D;
                yardResult = distanceValue * 1760D;
                ftResult = distanceValue * 5280D;
            }

            else if (distanceType == 3) {
                yardResult = distanceValue;
                meterResult = distanceValue * 0.914400D;
                mileResult = distanceValue * 0.000568D;
                ftResult = distanceValue * 3D;
            }

            else if (distanceType == 4) {
                ftResult = distanceValue;
                meterResult = distanceValue * 0.304800D;
                mileResult = distanceValue * 0.000189D;
                yardResult = distanceValue * 0.333333D;
            }

            else {
                System.out.println("Вы ввели что-то другое, программа закрыта...");
                return;
            }

            System.out.print("Результат:\nМетры: " + meterResult + "\nМилли: " + mileResult + "\nЯрды: " + yardResult + "\nФуты: " + ftResult);
        }

        else {
            System.out.println("Вы ввели что-то другое, программа закрыта...");
            return;
        }
    }
}