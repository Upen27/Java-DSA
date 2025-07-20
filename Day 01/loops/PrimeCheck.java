// Check Whether a number is prime or not 
import java.util.*;
public class PrimeCheck {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if(num==2) {
            System.out.println(num+" is a prime number.");
         } else {
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
           if(isPrime) System.out.println(num+" is a prime number.");
           else System.out.println(num+" is not a prime number.");
         }
        sc.close();
    }
}
