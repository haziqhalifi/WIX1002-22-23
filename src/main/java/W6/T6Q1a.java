
package W6;
import java.util.Scanner;
public class T6Q1a {
    
    
    public static void definemax(int num1, int num2, int num3)
    {
        if (num1>num2 && num1>num3)
            System.out.println("The maximum number is "+num1);
        if (num2>num1 && num2>num3)
            System.out.println("The maximum number is "+num2);
        if (num3>num1 && num3>num2)
            System.out.println("The maximum number is "+num3);
    }
    public static void main(String[] args) {
        int num1,num2, num3;
        System.out.println("Enter 3 numbers: ");
        Scanner key = new Scanner(System.in);
        //User enter numbers
        num1 = key.nextInt();
        num2 = key.nextInt();
        num3 = key.nextInt();
        
        definemax(num1,num2,num3);
    }
}
