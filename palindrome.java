package MyProject;
import java.util.*;

public class palindrome {
  public static void main(String[] args) {
        System.out.print("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        if (str.contentEquals(sb)){
            System.out.println("It is a palindrome.");
        }else{
            System.out.println("It is not a palindrome.");
        }          
        sc.close();
    }
}