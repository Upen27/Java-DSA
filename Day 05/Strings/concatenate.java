import java.util.*;
public class concatenate {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first name   :");
        String firstName= sc.nextLine();
        System.out.println("Enter the second name :");
        String lastName= sc.nextLine();
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        sc.close();
    }
}
