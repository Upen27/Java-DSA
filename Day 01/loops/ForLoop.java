// Sum of first n natural numbers 
import java.util.*;
public class ForLoop {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n :");
      int n = sc.nextInt();
      int sum=0;
      for( int i=0; i<=n;i++){
        sum+=i;
      }
      System.out.println("The Sum of the first n natural numbers is "+sum);
      sc.close();
}
}
