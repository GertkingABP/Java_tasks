import java.util.*;

public class StringTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] lines = new String[n];

        System.out.println("Введите строки:");
        for (int i = 0; i < n; i++) {
            lines[i] = scanner.nextLine();
        }

        scanner.close();
        int maxLen = 0;
        int currentLen;
        String result = "";
        for (String line : lines) {
            Set<Character> uniqueCharsInLine = new HashSet<>();
            for (char c : line.toCharArray()) {
                uniqueCharsInLine.add(c);
            }

            currentLen = uniqueCharsInLine.size();

            if (currentLen > maxLen) {
                maxLen = currentLen;
                result = line;
            }
        }

        System.out.println("Ответ: " + result);
    }
}