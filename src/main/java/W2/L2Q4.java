
package W2;
import java.util.Scanner;

public class L2Q4 {
    public static void main(String[] args) {
        int sec;
        System.out.println("Enter the number of seconds : ");
        Scanner keyboard = new Scanner(System.in);
        sec = keyboard.nextInt();
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds", sec, (sec/3600), (sec/60-sec/3600*60), (sec%60));
                
                
                
          
    }
}
