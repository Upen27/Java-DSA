// Search an element in a array by  binary search method 

import java.util.Scanner;

public class reverseArray {
    public static void reverse(int arr[]){
        int start=0,end=(arr.length)-1;
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;   
        }
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
    reverse(arr);
    System.out.println("The Reversed array is :");
    for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
    }
    sc.close();
}
    
}
