import java.util.Scanner;
public class Element_Frequency_Array {
    public static void main(String[] args){
        int i, j, count = 0;
       try( Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the size of Array:");
        int size = sc.nextInt();
        if( size <= 0){
            System.out.println("Array of size less than or equal to zero does not exist.");
            return;
        }
        int arr[] = new int[size];
        System.out.println("Enter the elements of Array:");
        for(i = 0; i < size; i++){
         arr[i] = sc.nextInt();
        }
         for(i = 0; i < size; i++){
            count = 0;
               for (j = 0; j < size; j++){
                 if(arr[i] == arr[j]){
                count++;
            }
        }
               System.out.println("Frequency of " + arr[i] + " is : " + count);
    }
}
    }
}
