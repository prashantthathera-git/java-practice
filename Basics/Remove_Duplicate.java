import java.util.Scanner;
public class Remove_Duplicate {

    public static void main(String[] args){
        int i,j;
         try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size of array: ");
            int size = sc.nextInt();
            if(size < 1){
                System.out.println("Array size is invalid! , Enter positive number greater than 0 ");
               return;
            }
            int arr[] = new int[size];
            System.out.println("Enter the Elements of Array: ");
            for(i = 0; i < size; i++){
                arr[i]= sc.nextInt();
            }

            // deleting the duplicate elements

            System.out.println("Array after removing Duplicate Elements :");
            boolean visited[] = new boolean[size];
            for(i=0;i<size;i++){
                if(visited[i])
                    continue;
            for(j=i+1;j<size;j++){
                if(arr[i] == arr[j]){
                visited[j] = true;
                }
            }
              System.out.print("   "+arr[i]);
            }
             System.out.println(); 
         }

    }

    
}
