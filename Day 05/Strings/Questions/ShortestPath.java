import java.util.*;
public class ShortestPath {
    public static float path(String str){
        int x=0,y=0; // initially at origin
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)=='N') y++; // going upward 
            else if(str.charAt(i)=='S') y--;
            else if(str.charAt(i)=='E') x++;
            else if(str.charAt(i)=='W') x--;
            else {
                System.out.println("Invalid Path Entered !!");
                break;
            }
        }
        int X2=x*x;
        int Y2 = y*y;
        float PathLength=(float) Math.sqrt(X2+Y2);
        return PathLength;
    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the path (e.g.'EWSNNSE') :");
        String str= sc.nextLine();
        System.out.println("The shortest path is  :"+path(str));
        sc.close();
    }
}
