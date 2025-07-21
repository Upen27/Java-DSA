 import java.util.*;

public class DecimalToBinary{
    public static int DecToBin( int DecNum){
        int pow=0;
        int bin = 0;
        while (DecNum>0) {
            bin+=(DecNum%2)*(int)Math.pow(10, pow);
            pow++; 
            DecNum/=2;  
        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Decimal Number :");
        int DecNum = sc.nextInt();
        System.out.println("The Binary of"+DecNum+" is : "+DecToBin(DecNum));
        sc.close();
    }
}
 
