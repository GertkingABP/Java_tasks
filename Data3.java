import java.util.Scanner;
import java.util.ArrayList;

public class Data3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String str = scanner.nextLine();

        String[] words = str.split(" ");
        ArrayList<String> latinWords = new ArrayList<>();

        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                latinWords.add(word);
            }
        }

        System.out.println("\nСлова латиницы:");
        for (String word : latinWords) {
            System.out.println(word);
        }

        System.out.println("\nКоличество слов: " + latinWords.size());
    }
}