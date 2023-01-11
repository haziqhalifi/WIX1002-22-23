
package W2;
import java.util.Random;
public class L2Q3 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Random keyboard = new Random();
        num1 =  keyboard.nextInt(41)+10;
        num2 =  keyboard.nextInt(41)+10;
        num3 =  keyboard.nextInt(41)+10;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.printf("Sum of the numbers = %d ",(num1+num2+num3));
    }
}
