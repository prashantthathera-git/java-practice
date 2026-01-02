import java.util.Scanner;

public class DayTimeAlarm {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch(day) {
               
            case 1:
                System.out.println("Monday");
                System.out.println("Morning Alarm at 7:00 AM");
                break;
            case 2:
                System.out.println("Tuesday");
                System.out.println("Morning Alarm at 7:00 AM");
                break;
            case 3:
                System.out.println("Wednesday");
                 break;
           case 4:
                System.out.println("Thursday");
                System.out.println("Morning Alarm at 7:00 AM");
                break;
            case 5:
                System.out.println("Friday");
                System.out.println("Morning Alarm at 7:00 AM");
                break;
            case 6:
                System.out.println("Saturday");
                System.out.println("9:00 AM Alarm");
                break;
            case 7:
                System.out.println("Sunday");
                System.out.println("No Alarm");
                break;
            default:
                System.out.println("Invalid day");
        }
        sc.close();
    }
}