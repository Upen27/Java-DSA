import java.util.Scanner;

public class BinaryToDecimal {
    public static int binToDec( int binNum){
        int pow=0;
        int Dec = 0;
        while (binNum>0) {
            Dec+=(binNum%10)*(int)Math.pow(2, pow);
            pow++; 
            binNum/=10;  
        }
        return Dec;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Binary Number :");
        int binNum = sc.nextInt();
        System.out.println("The Decimal of"+binNum+" is : "+binToDec(binNum));
        sc.close();
    }
}
