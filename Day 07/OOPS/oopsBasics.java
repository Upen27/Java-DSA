import java.util.*;
public class oopsBasics {
    public static class Student{
        String name;
        int roll_no;
        float percentage;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s1= new Student();
        System.out.println("Enter the name of the student :");
        s1.name=sc.nextLine();
        System.out.println("Enter the roll no. of the student :");
        s1.roll_no=sc.nextInt();
        System.out.println("Enter the percentage  of the student :");
        s1.percentage=sc.nextFloat();
        System.out.println("Details of the student :");
        System.out.println("Name:"+s1.name+"\n Roll No. :"+s1.roll_no+"\n Percentage :"+s1.percentage);
        sc.close();
        }
}
