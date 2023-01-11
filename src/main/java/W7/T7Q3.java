
package W7;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class T7Q3 {
    
    public static void main(String[] args) throws Exception{
        PrintWriter writer = new PrintWriter("data.txt");
        writer.print("Ali Muthu Ah Hock");
        writer.close();
    
        try{
            Scanner in = new Scanner(new File("data.txt"));
            System.out.println(in.nextLine());
            in.close();
        } catch (FileNotFoundException e){
            System.out.println("Problem with file output");
        }
    
    }
}
