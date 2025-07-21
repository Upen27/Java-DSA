 package MaxSubArraySum;
import java.util.Scanner;

public class bruteforce {
    public static void MaxSum(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int sum =0;
                for(int k=start;k<=end;k++){
                    sum +=arr[k];
                }
                if(sum>max) max=sum;              
            }
        }
        System.out.println("Maximum Sub Array Sum is :"+ max);
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
