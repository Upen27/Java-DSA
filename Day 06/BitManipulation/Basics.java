import java.util.*;
public class Basics {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1=sc.nextInt();
        System.out.println("Enter second number :");
        int num2=sc.nextInt();

        // AND Operator 
        System.err.println(num1+"&"+num2+"="+(num1 & num2));
        // OR Operator
         System.err.println(num1+"|"+num2+"="+(num1|num2));
         //XOR Operator
          System.err.println(num1+"^"+num2+"="+(num1 ^ num2));
        //NOT operator ( One complement) 
         System.err.println(num1+"~"+"="+~num1);
         System.err.println(num2+"~"+"="+~num2);
         sc.nextLine();
         sc.close();
    }
}
