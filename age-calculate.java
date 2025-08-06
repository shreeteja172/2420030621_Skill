package Myproject;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class agecalculate {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your birthdate (DD-MM-YYYY): ");
		String input = sc.nextLine();
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate bday = LocalDate.parse(input,fm);
        LocalDate today = LocalDate.now();
        Period age = Period.between(bday, today);
        int years = age.getYears();
        int days = age.getDays();
        int months = age.getMonths();
        System.out.println("You are " + years + " years," + months + " months," + days + " days old ");
        sc.close();
	}
}
