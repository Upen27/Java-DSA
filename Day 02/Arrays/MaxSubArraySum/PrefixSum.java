package MaxSubArraySum;

import java.util.Scanner;

public class PrefixSum {
    public static void MaxSum(int arr[]){
        int prefix[]= new int[arr.length];
        int Presum=arr[0];  // PreSum -> Prefix Sum upto index i
        prefix[0]=arr[0]; 
        for(int i=1;i<arr.length;i++){
            Presum+=arr[i];
            
            prefix[i]=Presum;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int sum = (start==0)?prefix[end]:prefix[end]-prefix[start-1];
                // if start=0 then start-1=-1 , index can't be -1 
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

