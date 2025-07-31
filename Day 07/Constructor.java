
public class Constructor {
    public static class Student{
        String name;
        int roll_no;
        float percentage;
        public Student(){ // if arguements are not passesd 

        }
        public Student(String name, int roll,float percentage){ // constructor for student class
            this.name=name;
            this.roll_no=roll;
            this.percentage=percentage;
        }

    }
    public static void main(String[] args) {
        Student s1=new Student("Upen",50,99.9f);
        System.out.println("Name:"+s1.name+"\n Roll No. :"+s1.roll_no+"\n Percentage :"+s1.percentage);
    }
}
