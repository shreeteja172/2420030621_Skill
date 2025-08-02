package MyProject;
import java.util.*;


public class scannerexamples {
    
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("ENTER A NUMBER: ");
    int a= sc.nextInt();
    System.out.println("ENTER A byte: ");
    byte b =sc.nextByte();
    System.out.println("ENTER A float number: ");
    float c=sc.nextFloat();
    System.out.println("ENTER A long value: ");
    long d = sc.nextLong();
    System.out.println("ENTER A short: ");
    short e = sc.nextShort();
    System.out.println("ENTER A string ");
    String f =sc.next();
    
    System.out.println("The number is: "+a);
    System.out.println("This is byte: "+b);
    System.out.println("This is float: "+c);
    System.out.println("This is long: "+d);
    System.out.println("This is short: "+e);
    System.out.println("This is string: "+f);
    sc.close();
  }

}