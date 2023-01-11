package W2;

import java.util.Scanner;

public class L2Q1 {
    public static void main(String[] args) {
        
    
         float fahren;
        System.out.println("Enter temperature in Fahrenheit:");
        Scanner keyboard = new Scanner(System.in);
        fahren = keyboard.nextFloat();
        System.out.printf("Celcius =%.2f ", ((fahren-32)/1.8));
}
}