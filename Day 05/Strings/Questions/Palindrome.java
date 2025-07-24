
        // check whether a string is a palindrome or not 
import java.util.*;
public class Palindrome {
   public static boolean isPal( String str){
    int start=0,end=str.length()-1;
    while (start<end) {
        if (str.charAt(start)!=str.charAt(end)) {
            return false;     
        }
        start++;
        end--;

    }
    return true;
   }
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String :");
        String str= sc.nextLine();
        if (isPal(str)) {
            System.out.println("The entered String is a palindrome ! :");
        } else System.out.println("The entered String is not a palindrome ! :");
        sc.close();
}
}

