import java.util.Scanner;
import java.util.Random;

public class Riddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        String rightAnswer = "Заархивированный вирус";
        String helpAnswer = "Подсказка";
        int tries = 3;
        String[] helps = {
                "Обитатель хранилища\n",
                "На это есть Касперский\n",
                "В компьютере много уязвимых папок и файлов, там кто-то может быть\n"
        };
        Random random = new Random();
        int randomIndex;
        String yourAnswer = "";

        while (tries > 0) {
            System.out.print("\nВаш ответ: ");
            yourAnswer = scanner.nextLine();
            System.out.print("\n");

            if (yourAnswer.equalsIgnoreCase(rightAnswer)) {
                System.out.print("\nПравильно!");
                return;
            }

            else if ((!yourAnswer.equalsIgnoreCase(helpAnswer)) && (!yourAnswer.equalsIgnoreCase(rightAnswer))) {
                tries--;
                System.out.print("\nПодумай еще, у тебя осталось попыток: " + tries);
            }

            else if (yourAnswer.equalsIgnoreCase(helpAnswer) && tries == 3) {
                randomIndex = random.nextInt(helps.length);
                String randomHelp = helps[randomIndex];
                System.out.println("Вот подсказка: " + randomHelp);
                tries = 1;
            }

            else if (yourAnswer.equalsIgnoreCase(helpAnswer) && tries < 3) {
                System.out.println("Подсказка уже недоступна");
            }

            if (tries == 0){
                System.out.print("\nОбидно, приходи в другой раз");
                return;
            }
        }

        scanner.close();
    }
}