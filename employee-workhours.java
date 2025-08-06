package Myproject;
import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
public class employeeworkhours {
	public static void main(String args[]) {
		LocalTime start = LocalTime.of(9, 0); 
        LocalTime end = LocalTime.of(18, 0);
        LocalTime login = LocalTime.of(9, 15);  
        LocalTime logout = LocalTime.of(17, 45); 
        LocalTime today = LocalTime.now();
//        System.out.println(today);
        DateTimeFormatter fm = DateTimeFormatter.ofPattern("hh:mm:ss a");
//      10:53:20.995341800
//      Time: 10:53:20 am
        System.out.println("Time: " + today.format(fm));
        if (!login.isBefore(start) && !login.isAfter(end)) {
            System.out.println("Employee logged  during office hours.");
        } else {
            System.out.println("Employee didnt log in during office hours.");
        }
        Duration worktime = Duration.between(login, logout);

        long hours = worktime.toHours();
        long minutes = worktime.toMinutes() % 60;        
        System.out.println("Workk total: " + hours + " hours and " + minutes + " minutes");
	}
}

