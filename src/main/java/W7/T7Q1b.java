
package W7;

import java.io.File;
import java.util.Scanner;

public class T7Q1b {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(new File("Integer.txt"));
        int curMax = -1;
        for (int i = 0; i < 10; i++) {
            int current = in.nextInt();
            curMax = Math.max(current, curMax);
            System.out.print(current + " ");
        }

        System.out.println("\nLargest integer is: " + curMax);
  
         
    }

}
