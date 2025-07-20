// Make a simple calculator using the switch statement
import java.util.Scanner;
public class switch1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the expression ( like 3+5 ) : ");
        int a = sc.nextInt();
        char operator = sc.next().charAt(0);
        int b = sc.nextInt();
        switch (operator) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid Operator !!");
        }
        sc.close();
    }
}
