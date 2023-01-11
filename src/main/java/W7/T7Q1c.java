
package W7;
import java.io.DataOutputStream;
import java.util.Random;
import java.io.FileOutputStream;
public class T7Q1c {
    public static void main(String[] args) throws Exception{
        
        FileOutputStream fout = new FileOutputStream("integer.dat");
        DataOutputStream dout = new DataOutputStream(fout);
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
                dout.write(random.nextInt(1001));
            }
            dout.close();  
        }
            
}
