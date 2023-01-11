package W5_PS;

import java.util.Scanner;

public class PS1_2 {
    public static void main(String[] args) {
        float total=0;
        float sales;
        String type;
        String Q = "Quit";
        Scanner key = new Scanner(System.in);
        do
        {
            System.out.println("Enter the type of durian [Quit] to terminate: ");
            type = key.next();
            if(type.equalsIgnoreCase(Q))
                break;

            System.out.println("Enter the sales in kg: ");
            sales = key.nextFloat();
      
            if(type.equals("MK")) 
                sales*=25;
                    
            else if(type.equals("HL")) 
                sales*=22;
                    
            else if(type.equals("D24")) 
                sales*=20;
                    
            else if(type.equals("UM"))
                sales*=18;
 
            total+=sales;

        }while(!type.equalsIgnoreCase(Q));
        System.out.println("");
        System.out.printf("Total sales : %.2f", total);

    }
}
