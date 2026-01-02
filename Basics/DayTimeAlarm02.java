import java.util.Scanner;

public class DayTimeAlarm02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter day u want alarm for:");
          String day = sc.next();
          day = day.toUpperCase();

        switch(day){
            case "MONDAY","TUESDAY" -> System.out.println("Morning Alarm at 7:00 AM");
            case "WEDNESDAY","THURSDAY","FRIDAY" -> System.out.println("Morning Alarm at 8:00 AM");
            case "SATURDAY","SUNDAY" -> System.out.println("No Alarm");
            default -> System.out.println("Invalid day");
        }
        sc.close();
    }
}