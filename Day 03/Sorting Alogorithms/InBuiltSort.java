import java.util.Arrays;
import java.util.Scanner;
public class InBuiltSort {
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size=sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the array elements :");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
          Arrays.sort(arr); // Bulit-in Function . This will sort the array 

        System.out.println("Sorted Array :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
