package MyProject;
import java.util.Scanner;

public class wordsandcharacs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine().trim();
        System.out.println("Words: " + (input.isEmpty() ? 0 : input.split("\\s+").length));
        System.out.println("Chars: " + input.replace(" ", "").length());
        sc.close();
    }
}