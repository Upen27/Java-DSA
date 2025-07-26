import java.util.*;

public class GetIthBit {
    public static int GetIBit(int n, int i){
        int bitmask =1<<i;
        return n&bitmask;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  number :");
        int num=sc.nextInt();
        System.out.println("Enter the value of i  :");
        int i=sc.nextInt();
        System.out.println("ith bit is :"+GetIBit(num, i));
        sc.close();
    }
}
