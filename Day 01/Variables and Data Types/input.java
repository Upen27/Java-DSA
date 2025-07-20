// Sum of two numbers taken as input from user

import java.util.*;
public class input {
    public static void main(String args[]){
        System.out.print("Enter The Numbers :\n");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.print("The Sum of the numbers is "+sum);
        sc.close();
    }
}
