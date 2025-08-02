package MyProject;
import java.util.Scanner;

public class greatestnumin3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = scanner.nextInt();

        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        System.out.println("Enter third number:");
        int c = scanner.nextInt();

        int greatest;

        if(a >= b && a >= c){
            greatest = a;
        }else if(b >= a && b >= c){
            greatest = b;
        }else{
            greatest = c;
        }

        System.out.println("The greatest number is:" + greatest);

        scanner.close();
    }
}