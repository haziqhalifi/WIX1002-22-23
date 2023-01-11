
package W6;
import java.util.Scanner;
public class T6Q1b {
    
    
    public static void squarenumber(int num)
    {
       
        for(int i=0;i<num;i++)
        {
            if (Math.pow(i, 2)==num)
                System.out.print(num+" is a square number of "+i);
        }
    }
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number : ");
        Scanner key = new Scanner(System.in);
        num = key.nextInt();
        squarenumber(num);
        
    }
}
