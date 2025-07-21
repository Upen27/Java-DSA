import java.util.Scanner;

public class PrintSubarrays {
    public static void Subarrays(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();

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
    System.out.println("All Possible Subarrays are :");
    Subarrays(arr);
    sc.close();
}
}
