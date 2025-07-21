package MaxSubArraySum;

import java.util.Scanner;

public class KadanesAlgo {
    public static void MaxSum(int arr[]){
        int current_sum = arr[0];
        int max_sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            current_sum = Math.max(arr[i], current_sum + arr[i]);
            max_sum = Math.max(max_sum, current_sum);
        }
        System.out.println("The max sub array sum is: " + max_sum);


    }
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of the array :");
    int size=sc.nextInt();
    int arr[]= new int[size];
    System.out.println("Enter the array elements :");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    MaxSum(arr);
    sc.close();
}
    
}
