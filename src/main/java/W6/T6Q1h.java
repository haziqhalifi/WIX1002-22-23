/*h. Define a static method that generate random number within 0 – 10. 
The method will return the first random number that generate twice.*/ 
package W6;
import java.util.Random;
public class T6Q1h {
    static int num1, num2;

    public static void main(String[] args) {
        
            for (int i =1; i>0;i++)
            {

                if (Randomnumber1() == Randomnumber2())
                {
                    System.out.println(num1+" = "+num2);
                    break;
                }
                    
                System.out.println(num1+" != "+num2);
            
            }
        
        System.out.println("The first random generated twice is " +num2);
    }
    
    
    static int Randomnumber1()
    {
        Random rand = new Random();
        num1 = rand.nextInt(11);
        return num1;
    }
    
    static int Randomnumber2()
    {
        Random rand = new Random();
        num2 = rand.nextInt(11);
        return num2;
    }
    
}
