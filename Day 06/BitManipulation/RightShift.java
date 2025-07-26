import java.util.*;
public class RightShift {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  number :");
        int num=sc.nextInt();
        System.out.println("Enter the number of bits for right shift  :");
        int bits=sc.nextInt();
        System.out.println(num+">>"+bits+"="+(num>>bits));
        sc.close();
    }
}
