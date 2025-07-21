import java.util.*;
public class BinarySearch {
    public static int binary( int arr[],int key){
        int start=0,end=(arr.length)-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (arr[mid]==key) {
                return mid;                
            } 
            if (arr[mid]>key) { // This means that key lies in the first half 
                end=mid-1;   
            } else {
                start=mid+1; // key in second half 
            }
        }
        return -1; // if key not found
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
    int index=binary(arr, key);
    if(index==-1) System.out.println("Key not found in the array !");
    else System.out.println("Key found at index :"+index);
    sc.close();
}
}
