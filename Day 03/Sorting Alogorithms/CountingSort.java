
import java.util.Scanner;

public class CountingSort {
    public static void sort(int arr[]){
        int range=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>range) range=arr[i];
        }
        int CountArr[]=new int[range +1];
        for(int i=0;i<arr.length;i++){
            CountArr[arr[i]]++;
        }
        int j=0; // for original array
        for(int i=0; i<CountArr.length;i++){
            while (CountArr[i]>0) {
                arr[j]=i;
                j++;
                CountArr[i]--;   
            }
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
