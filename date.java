package MyProject;
import java.util.*;

public class date {
  public static void main(String args[]) {
    Date d=new Date();
    System.out.println("Current date is "+ d);
    int month=d.getMonth();
    System.out.println("The month is "+ month);
    int year=d.getYear();
    System.out.println("The year is "+ year);
    System.out.println(d.getMinutes());
    System.out.println(d.getHours());
  }