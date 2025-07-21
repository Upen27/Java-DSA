 import java.util.Scanner;

public class binomialCofficient {
    public static int  fact( int num ){
        if (num==0||num==1) {
            return 1;  
        } else {
            return num*fact(num-1);
        }
    }
public static int ncr(int n , int r){
    return fact(n)/(fact(r)*fact(n-r));
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and r :");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(ncr(n,r));
        sc.close();
    }
}

