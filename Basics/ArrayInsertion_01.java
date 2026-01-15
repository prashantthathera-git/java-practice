// Insert  element into an array at any position

import java.util.Scanner;

public class ArrayInsertion_01 {
    
    public static void main(String[] args){
        int i;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of Array :");
       int originalSize =sc.nextInt();
       System.out.println("Enter the position where you want to insert elements");
       int pos = sc.nextInt();
       if(pos > originalSize+1 || pos < 1){
        System.out.println("Invalid Position! Position should be greater than or equal to 1 and less than or equal to " + (originalSize+1));
        return;
       }
       System.out.println("Enter how many elements you want to insert at that position:");
       int insertCount = sc.nextInt(); 
       int totalSize = originalSize + insertCount;
       int arr[] =new int[originalSize + insertCount]; // Increase size by insertCount for insertion
       System.out.println("Enter the Element of array:");
       for( i = 0; i < originalSize; i++){
        arr[i] = sc.nextInt();
       }

       // Shift elements to the right to make space at the given position

       for(i = originalSize-1 ; i >= pos-1; i--){
        arr[i + insertCount] = arr[i];
       }

       // Insert new elements at the given position
    
       System.out.println("Enter the " + insertCount + " elements you want to insert at position " + pos + ":");
       for(i=pos-1; i < insertCount + pos-1; i++){
        arr[i] = sc.nextInt();
       }
         System.out.println("The Elements of Array after Insertion are :");
         for(i=0; i < totalSize; i++){
            System.out.print(arr[i]+"  ");
         }
         System.out.println();
            sc.close();
       
    }
}