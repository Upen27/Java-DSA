
public class LargestString {

    public static void main(String[] args) {
        String fruits[]={"Mango","Banana","Orange","Guava"};
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println("Largest String is :"+largest);

    }
}
