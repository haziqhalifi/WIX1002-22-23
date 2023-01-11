
package W2;

import java.util.Random;

public class L2Q5 {
    public static void main(String[] args) {
        int num, digit;
        int sum = 0;
        Random random = new Random();
        num = random.nextInt(10001);
        System.out.println(num);
        while(num > 0)  
{  
//finds the last digit of the given number    
digit = num % 10;  
//adds last digit to the variable sum  
sum = sum + digit;  
//removes the last digit from the number  
num = num / 10;  
} 
        System.out.println(sum);
    }
 
}
