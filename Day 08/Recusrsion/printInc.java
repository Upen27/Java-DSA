import java.util.Scanner;

public class printInc {
    public static void print(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        
        print(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        print(n);
        sc.close();
    }
}
