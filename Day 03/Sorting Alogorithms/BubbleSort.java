      // Bubble sort 

import java.util.*;;
public class BubbleSort {
    public static void sort( int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
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
        sort(arr);sc.close();
    }
}
