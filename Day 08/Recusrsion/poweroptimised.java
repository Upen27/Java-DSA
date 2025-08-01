import java.util.Scanner;

public class poweroptimised {
    public static int pow(int x,int n){
        if(n==0) return 1;
        int halfsq=pow(x,n/2);
        halfsq*=halfsq;
        if(n%2!=0) halfsq*=x;
        return halfsq;
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
