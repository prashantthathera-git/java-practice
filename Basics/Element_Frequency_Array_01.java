import java.util.Scanner;
public class Element_Frequency_Array_01 {

    public static void main(String[] args){
        int i,j , count = 0;
         try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size of array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the Elements of Array: ");
            for(i = 0; i < size; i++){
                arr[i]= sc.nextInt();
            }

            // Finding the Frequency

            boolean visited[] = new boolean[size];
            for(i=0;i<size;i++){
                count = 0;
                if(visited[i])
                    continue;
            for(j=0;j<size;j++){
                if(arr[i] == arr[j]){
                    count ++;
                visited[j] = true;
                }
            }
            System.out.println("Frequency of Element " + arr[i] + " = " + count);
               

            }
         }

    }

    
}
