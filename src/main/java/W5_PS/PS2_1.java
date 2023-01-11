
package W5_PS;

import java.util.Random;
import java.util.Scanner;

public class PS2_1 {
    public static void main(String[] args) {
        Random r = new Random();
        int loop=0;
        int N, temp;  
        System.out.println("Enter the number of staff [N] : ");
        Scanner key = new Scanner(System.in);
        N = key.nextInt();
        String ID;
        System.out.println("");
        for(int i=0;i<N;i++)
        {
            System.out.print("Staff ID : ");
            temp = r.nextInt(89999)+10000;
            ID =String.valueOf(temp); // can use also ID=Integer.toString(temp);
            System.out.println(ID);
            if ((ID.charAt(1)%2!=0)&&(ID.charAt(3)%2==0))
            {
                System.out.println("Weekend Duty");
                loop++;
            }
            else
                System.out.println("Weekend Off");
            System.out.println("");
        }
        System.out.println("The number of staff work during weekend is "+loop);
    }
}    

