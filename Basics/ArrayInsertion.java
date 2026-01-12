// Insertion in Beginning of Array
import java.util.Scanner;

public class ArrayInsertion {

    public static void main(String[] args) {
        int i, totalSize = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int originalSize = sc.nextInt();
        System.out.println("Enter how many elements you want to insert at the beginning:");
        int insertCount = sc.nextInt();
        int arr[] = new int[originalSize + insertCount]; // Increase size by insertCount for insertion
        totalSize = originalSize + insertCount;
        System.out.println("Enter the Elements of Array:");
        for(i=0;i<originalSize;i++){
            arr[i] = sc.nextInt();
        }
       // Shift elements to the right to make space at the beginning
        for(i = originalSize-1;i >= 0;i--){
            arr[i + insertCount] = arr[i];
             }
       // Insert new elements at the beginning
        System.out.println("Enter the " + insertCount + " elements you want to insert at the beginning:");
        for(i=0;i<insertCount;i++){
            arr[i] = sc.nextInt();
        }
          System.out.println("Original Array before shifting :");
        for(i= insertCount; i<totalSize; i++){
            System.out.println(arr[i]);
        }
        System.out.println("The Elements of Array after Insertion are :");
        for(i=0;i<totalSize;i++){
            System.out.println(arr[i]);
            
        }
        sc.close();
    }
}