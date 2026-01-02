import java.util.Scanner;

public class DayTimeAlarm01 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String day = sc.next();
       day = day.toUpperCase();
       
        switch(day){
            case "MONDAY","TUESDAY" :
            System.out.println("Morning Alarm at 7:00 AM");
                break;
            case "WEDNESDAY","THURSDAY","FRIDAY":
                System.out.println("Morning Alarm at 8:00 AM");
                break;
            case "SATURDAY","SUNDAY":
                 System.out.println("No Alarm");
                break;
            default :
            System.out.println("Invalid day");
        }
        sc.close();
    }
}
