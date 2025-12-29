import java.util.*;

class ifelif {
public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
      if(N%2==0)
      {
        if (N>20 || (N>=2 && N<5))
        System.out.println("Not Weird");
        else
        System.out.println("Weird");
      }
      else
      System.out.println("Weird");
        sc.close();
    }
}
