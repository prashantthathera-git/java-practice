// 1D Array in Java
import java.util.Scanner;

 class Array {     
 
    public static void main(String[] args){
        int i;
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the size of Array :");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the Elements of Array");
        for(i=0;i<s;i++){
            arr[i] = sc.nextInt();
        }
         System.out.println("The Elements of Array are :");
        for(i=0;i<s;i++){
            System.out.println(arr[i]);
        }
       
    }
}
 }