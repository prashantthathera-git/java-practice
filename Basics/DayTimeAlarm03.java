import java.util.Scanner;

public class DayTimeAlarm03 {
    public static void main(String[] args) {
        System.out.println("Enter day you want alarm for:");
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine().trim().toUpperCase();
        String alarm="";
        switch(day){
            case "MONDAY","TUESDAY" -> alarm = "Morning Alarm at 7:00 AM";
            case "WEDNESDAY","THURSDAY","FRIDAY" -> alarm = "Morning Alarm at 8:00 AM";
            case "SATURDAY" -> alarm = "9:00 AM Alarm";
            case "SUNDAY" -> alarm = "No Alarm";
            default -> alarm = "Invalid day";
        }
        System.out.println(alarm);
        sc.close();
    }
    
}