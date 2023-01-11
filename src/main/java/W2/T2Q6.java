/*Write a java program that print the circumference of a circle. 
The input of the program is diameter. 
Display the result in three decimal places. (Note π = Math.PI) */

package W2;

import java.util.Scanner;

public class T2Q6 {
    public static void main(String[] args) {
        float dia, circum;
        System.out.println("Enter diameter :");
        Scanner keyboard = new Scanner(System.in);
        dia = keyboard.nextFloat();
        circum =(float) (Math.PI*dia);
        System.out.printf("The circumference of the circle  is : %.3f", circum);
    }
}
