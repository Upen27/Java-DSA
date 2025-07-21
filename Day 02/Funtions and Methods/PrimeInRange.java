import java.util.Scanner;

public class PrimeInRange {
    public static boolean isPrime( int num){
        if(num==2) return true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range :");
        int range=sc.nextInt();
        System.out.println("The list of prime numbers in the given range : ");
        for(int i=2;i<=range;i++){
            if(isPrime(i)) System.out.print(i+" ");
        }
        sc.close();
    }
    
}
