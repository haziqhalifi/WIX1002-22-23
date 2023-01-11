
package W6;
import java.util.Scanner;
import java.util.Random;
public class L6Q5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        int a,b,c;

        while(true){
            System.out.println("Enter negative number to quit. ");
            a = rand.nextInt(13);
            b = rand.nextInt(13);
            System.out.printf("%d x %d = ", a, b);
            c = in.nextInt();
            System.out.println("");
            
            if (c < 0) {
                break;
            }
            
            if (isABequalC(a, b, c)){
                score++;
            }
        }

        System.out.println("\nYour Score is "+score);
        
    }

    public static boolean isABequalC(int a, int b, int c){
        return (a * b == c);
    }

}
