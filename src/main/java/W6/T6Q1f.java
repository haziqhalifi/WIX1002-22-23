// shoud be static void method
package W6;
import java.util.Random;

public class T6Q1f {
    
 /*   public static void main(String[] args) {
        int []num = new int [10];
        for(int i = 0; i<=9; i++){
        num[i] = randomnumber(i);
        System.out.println(num[i]);
        }
    }
    
    public static int randomnumber(int i) {
        Random rand = new Random();
        return rand.nextInt(101);
    }*/
    
        public static void main(String[] args) {
       int [] num = new int[10];
        randomnumber(num);
        System.out.println(num[8]);
        }
    
    
    public static void randomnumber(int num[]) {
        Random rand = new Random();
        for(int i = 0; i<=9; i++){
        num[i] = rand.nextInt(101);
        System.out.println(num[i]);
        }
    }

}