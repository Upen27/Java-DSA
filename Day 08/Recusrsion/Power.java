import java.util.Scanner;

public class Power {
    public static int pow(int x,int n){
        if(n==0) return 1;
        return x*pow(x,n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of x (base) :");
        int x=sc.nextInt();
        System.out.println("Enter the value of n (power) :");
        int n=sc.nextInt();
        System.out.println(x+" to the power  "+n+" is :");
        System.out.println(pow(x,n));
        sc.close();
    }
}
