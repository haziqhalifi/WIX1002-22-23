
package W2;

import java.util.Scanner;

public class L2Q2 {
    public static void main(String[] args) {
        float price, down, rate, loan, MP;
        System.out.println("The price of the car : ");
        Scanner keyboard = new Scanner(System.in);
        price = keyboard.nextFloat();
        System.out.println("Down payment : ");
        down = keyboard.nextFloat();
        System.out.println("Interest rate in percent: ");
        rate = keyboard.nextFloat();
        System.out.println("Loan duration in year: ");
        loan = keyboard.nextFloat();
        MP = ((price-down)*(1+rate*loan/100)/(loan*12));
        System.out.printf("Monthly payment = %.2f", MP);
        
        
    }
}
