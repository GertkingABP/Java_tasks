//import java.util.Scanner;

public class Data2 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        String str = "I like Java!!!";
        boolean answer1 = str.contains("Java");
        boolean answer2 = str.startsWith("I like");
        boolean answer3 = str.endsWith("!!!");
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.print("\n");

        if (answer1 == true && answer2 == true && answer3 == true) {
            System.out.println(str.toUpperCase());
        }

        String str2 = str.replace('a', 'o');
        System.out.print("\n");
        System.out.println(str2.substring(7, 11));
    }
}