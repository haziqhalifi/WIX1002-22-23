
package W6;
import java.util.Scanner;
public class T6Q1d {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter number of n : ");
        int n = key.nextInt();
        System.out.println("The pentagonal number is "+pentagonalnumber(n));
        
    }
    public static int pentagonalnumber(int k) {
        return k*(3*k-1)/2;
        
    }
}
