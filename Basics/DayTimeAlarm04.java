import java.util.Scanner;

public class DayTimeAlarm04 {
    public static void main(String[] args) {
      
        System.out.println("Enter day you want alarm for:");
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine().trim().toUpperCase();
        String alarm="";
       
        alarm = switch(day){               //using switch as an expression
            case "MONDAY","TUESDAY" -> "Alarm at 7:00 AM";
            case "WEDNESDAY","THURSDAY","FRIDAY" -> "Alarm at 8:00 AM";
            case "SATURDAY" -> "Alarm at 9:00 AM";
            case "SUNDAY" -> "No Alarm";
            default -> "Invalid day";
        };
        System.out.println(alarm);
        sc.close();
    }
}