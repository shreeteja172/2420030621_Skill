package MyProject;
import java.util.*;

public class employee {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        System.out.println("Employee name:");
        String a = rd.nextLine();

        System.out.println("Employee ID:");
        double b = rd.nextDouble();  

        System.out.println("Employee salary:");
        double basic = rd.nextDouble();  

        System.out.println("Employee HRA percent:");
        float c = rd.nextFloat();

        System.out.println("Employee DA percent:");
        float d = rd.nextFloat();

        System.out.println("Employee PF percent:");
        float e = rd.nextFloat();

        double hra = ((c * basic) / 100);
        double da = ((d * basic) / 100);
        double pf = ((e * basic) / 100);  

        double gross = (basic + hra + da);
        double net = gross - pf;

        System.out.println("Salary Details");
        System.out.println("Employee name: " + a);
        System.out.println("Employee ID: " + b);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("PF: " + pf);
        
        System.out.println("Gross salary: " + gross);
        if(gross>20000)
          System.out.println("Yes eligible!!, as gross is greater than the threshold");
        System.out.println("Net salary: " + net);
    }
}