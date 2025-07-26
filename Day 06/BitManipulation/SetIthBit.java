import java.util.*;
public class SetIthBit {
      public static int SetIBit(int n, int i){
        int bitmask =1<<i;
        return n|bitmask;
    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  number :");
        int num=sc.nextInt();
        System.out.println("Enter the value of i  :");
        int i=sc.nextInt();
        System.out.println("Result after setting ith bit is :"+SetIBit(num, i));
        sc.close();
    }
}
