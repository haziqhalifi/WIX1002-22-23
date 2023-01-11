/* 
Write a java program that converts inches to meters. 
(Given 1 inch equals to 2.54 centimeters). 
Print the output in two decimal places. 
 */
package W2;
import java.util.Scanner;
        
public class T2Q7 {
    public static void main(String[] args) {
        float inch, meter;
        System.out.println("Enter value in inch : ");
        Scanner keyboard = new Scanner(System.in);
        inch = keyboard.nextFloat();
        meter = (float) (inch*2.54);
        System.out.printf("%.2f inches = %.2f meters",inch , meter/100);
    }
}
