// Search an element in a array by  linear search method 

import java.util.Scanner;
public class LinearSearch {
    public static int linear( int arr[], int key){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==key) return i;
        }
        return -1;
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
    System.out.println("Enter the key:");
    int key=sc.nextInt();
    int index=linear(arr, key);
    if(index==-1) System.out.println("Key not found in the array !");
    else System.out.println("Key found at index :"+index);
    sc.close();
}
}
