import java.util.Scanner;

public class Largest_Smallest_Array {
    public static void main(String[] args){
        int i , largest , smallest ;
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size of Array:");
            int size = sc.nextInt();
            if(size <= 0){
                System.out.println("Array of size less than or equal to zero does not exist.");
                return;
            }
            int arr[] = new int[size];
            System.out.println("Enter the Elelments of Array:");
            for(i = 0 ; i < size; i++){
                arr[i] = sc.nextInt();
            }
            largest = arr[0];
            smallest = arr[0];
            for( i=1;i<size;i++){
                if(arr[i] > largest){
                    largest = arr[i];
                }
                else if(arr[i] < smallest){
                    smallest = arr[i];
                }

            }
               System.out.println("Largest Element in Array is : " + largest);
               System.out.println("Smallest Element in Array is : " + smallest);

        }
    }
}
