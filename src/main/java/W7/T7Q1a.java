
package W7;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
public class T7Q1a {
    
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("integer.txt");
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                writer.print(random.nextInt(1001) + " ");
            }
            writer.close();  
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }  
    }

}
