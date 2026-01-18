import java.util.Scanner;

public class Arraydeletion {
    public static void main(String[] args){
        int i;
      try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Elements of array:");
        for(i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position from which you want to delete element:");
        int pos = sc.nextInt();
        if(pos < 1 || pos > size){
            System.out.println("Invalid Position! Position should be greater than or equal to 1 and less than or equal to " + size);
            return;
        }

          System.out.println("The Original Array is :");
        for(i = 0; i < size; i++){
            System.out.print(arr[i] + "  ");
        }
        
        // Shift elements to the left to delete element at given position

        for(i = pos - 1; i < size - 1; i++){
            arr[i] = arr[i+1];
        }
        //Printing array after deletion
      
        System.out.println();
            System.out.println("The Elements of Array after Deletion are :");
            for(i = 0; i < size - 1; i++){
                System.out.print(arr[i] + "  ");
            }
            System.out.println();
        }
    }
}

