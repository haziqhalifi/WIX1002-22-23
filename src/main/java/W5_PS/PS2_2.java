package W5_PS;
import java.util.Scanner;
public class PS2_2 {
    public static void main(String[] args) {
        int num, fac,score=0,counter=0;
        boolean ans;
        Scanner key = new Scanner(System.in);
        System.out.println("Enter a number (-1to quit) : ");
        num =key.nextInt();
        while(num!=-1)
        {
            System.out.println("Enter a factor :");
            fac = key.nextInt();
            System.out.println(fac+" is a factor of "+num+"? (true/false): ");
            ans = key.nextBoolean();
            if ((num%fac==0 && ans==true) || (num%fac!=0 && ans==false))
            {
                System.out.println("The answer is correct");
                score++;
            }               
            else
                System.out.println("The answer is incorrect");
        counter++; 
        System.out.println("Enter a number (-1to quit) : ");
        num =key.nextInt();
        }
        System.out.println("The final score is "+score+"/"+counter);
        
        
        
    }
}
