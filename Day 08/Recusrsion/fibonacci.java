import java.util.Scanner;

public class fibonacci {
    public static int fib(int n){
        if(n==0||n==1) return n;
        return fib(n-1)+fib(n-2);
    }
       public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        System.out.println("The "+n+"th  fibonacci term is :");
        System.out.println(fib(n));
        sc.close();
    }
}
