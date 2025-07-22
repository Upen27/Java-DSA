import java.util.Scanner;

public class SelectionSort {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=Integer.MAX_VALUE;
            int min_index=0; // stores the index of minimum element for swapping 
           for(int j=i;j<arr.length;j++){
                if (arr[j]<min) {
                    min=arr[j];
                    min_index=j;
                }
            }
           int temp=arr[i]; 
           arr[i]=min;
           arr[min_index]=temp;
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
        sort(arr);
        System.out.println("Sorted Array :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
