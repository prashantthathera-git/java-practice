import java.util.Scanner;

public class Scanning {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.next();
        scan.nextLine(); // consume the remaining newline
        String s1= scan.nextLine();
       
        System.out.println("String: " + s1);
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}