import java.util.Scanner;

public class PairsInArray {
    public static void pairs(int arr[]){
        System.out.println("The Possible pairs are:");
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+current+","+arr[j]+")");
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
    pairs(arr);
    sc.close();
}

}
