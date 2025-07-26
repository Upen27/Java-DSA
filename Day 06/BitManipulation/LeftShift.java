import java.util.*;
public class LeftShift {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  number :");
        int num=sc.nextInt();
        System.out.println("Enter the number of bits for left shift  :");
        int bits=sc.nextInt();
        System.out.println(num+"<<"+bits+"="+(num<<bits));
        sc.close();
    }
}
