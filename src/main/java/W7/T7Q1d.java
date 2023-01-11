package W7;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class T7Q1d {
    public static void main(String[] args) throws Exception{
    FileInputStream fin = new FileInputStream("integer.dat");
    DataInputStream din = new DataInputStream (fin);
    int sum = 0;
    for(int i = 0 ; i < 10 ; i++){
        int a =din.readInt();
        System.out.println(a + " ");
        sum+=a;
    }
    System.out.println("The average number is "+ (double)sum/10.0);
    din.close();
    }
}
