import java.util.Scanner;
public class Selection_Sort {
    public static void main(String[] args)
{
    int i, j, min =0,vac=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the Elements ");
    for(i=0;i<size;i++){
        arr[i] = sc.nextInt();
    }
//Selection Sort technique
    for(i=0;i<=size-2;i++){
        min =i;
        for(j=i+1;j<=size-1;j++){
            if(arr[j]<arr[min]){
                min = j;
                
            }
            }
 // Swaping the Elements
            vac = arr[i];          
            arr[i]=arr[min];
            arr[min]=vac;
    }
    System.out.print("Sorted Elements are: ");
    for(i=0;i<size;i++){
    System.out.print(" "+arr[i]);
}
    System.out.println();
    sc.close();
}  
}
