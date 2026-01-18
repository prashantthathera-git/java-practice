import java.util.Scanner;

public class  Rev_Array{

    public static void main(String[] args) {
        int i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array :");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the elements of Array:");
    for( i = 0; i < size; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("The Original Array is:");
    for(i = 0; i < size; i++){
        System.out.print(arr[i] + "  ");
    }
    System.out.println();

    // Reversing the array

    System.out.println("Reversed Array is:");
    for( i= size - 1; i >= 0; i--){
        System.out.print(arr[i] + "  ");
    }
    System.out.println();
    sc.close();

}
}
