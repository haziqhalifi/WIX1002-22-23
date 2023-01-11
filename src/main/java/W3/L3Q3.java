
package W3;
import java.util.Scanner;
public class L3Q3 {
    public static void main(String[] args) {
        double sales,comms = 0;
        System.out.println("Enter your sales volume in RM: ");
        Scanner keyboard = new Scanner(System.in);
        sales = keyboard.nextDouble();
        if (sales<=100)
            comms=0.05*sales;
        else if (sales>100 && sales<=500)
            comms=0.075*sales;
        else if (sales>500 && sales<=1000)
            comms=0.1*sales;
        else if (sales>1000)
            comms=0.125*sales;
        System.out.printf("Your total commisssion is RM%5.2f",comms);
        
        
            
    }
}
