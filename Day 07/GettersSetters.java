import java.util.Scanner;

public class GettersSetters {
    public static class User{
        String user_name;
        private String password;
        void SetPass(String password){ // function to set the password
            this.password=password;
        }  
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        User test=new User();
        System.out.println("Enter the username:");
        test.user_name=sc.next();
        System.out.println("Enter Password:");
        test.SetPass(sc.next());
        System.out.println("User created Successfully !");

    }
}
