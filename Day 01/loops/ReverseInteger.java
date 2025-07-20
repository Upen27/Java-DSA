import java.util.*;
public class ReverseInteger {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer :");
        int integer= sc.nextInt();
        int reverse=0;
        while (integer>0) {
        reverse=(reverse*10)+(integer%10);
        integer/=10;           
        }
        System.out.println("The Reverse is :"+reverse);
        sc.close();
    }
    
}
