
package W5;
import java.util.Random;
public class T5Q6 {
    public static void main(String[] args) {
        int input;
        Random k = new Random();
        input= k.nextInt(256);
        boolean[]bits = new boolean[8];
        for(int i=7;i>=0;i--){
            bits[7-i]=(input&(1<<i))!=0;
        }
        
        System.out.print(input+"=");
        for(int i=0;i<bits.length;i++)
        {
            if (bits[i])
                System.out.print("1");
            else 
                System.out.print("0");
            
        }
    }
}
