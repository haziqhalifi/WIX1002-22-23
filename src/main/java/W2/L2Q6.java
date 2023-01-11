
package W2;

import java.util.Scanner;

public class L2Q6 {
    public static void main(String[] args) {
        float gram, initial, finals, energy;
        System.out.println("Enter the weight of water in gram : ");
        Scanner keyboard = new Scanner(System.in);
        gram = keyboard.nextFloat();
        System.out.println("Enter the initial temperature in Fahrenheit : ");
        initial = keyboard.nextFloat();
        System.out.println("Enter the final temperature in Fahrenheit : ");
        finals = keyboard.nextFloat();
        
        
        energy = (float) ((gram/1000)*((finals-initial)/1.8)*4184);
        System.out.printf("The energy needed is %.6e",energy);
}
}