import java.util.*;
public class Substring {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String :");
        String str= sc.nextLine();
        System.out.println("Enter Starting index and ending index (not inclusive ):");
        int start=sc.nextInt();
        int end=sc.nextInt();
        System.out.println("The Substring is : "+str.substring(start, end));

        sc.close(); 
    }
}
