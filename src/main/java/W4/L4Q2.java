package W4;
import java.util.Scanner;
public class L4Q2 {
    public static void main(String[] args) {
        int num, sum1=0;
        int sum2;
        System.out.println("Enter an integer: ");
        Scanner k = new Scanner(System.in);
        num = k.nextInt();
        for(int i=1;i<=num;i++)
        {
            sum2 =0;
            for(int j=1;j<=i;j++)
            {

            sum2+=j;
            
            }
            sum1+=sum2;
        }
            System.out.println(sum1);      


        }
    }

