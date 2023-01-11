package W4;
import java.util.Scanner;
public class L4Q1 {
    public static void main(String[] args) {
        int num;
        System.out.println("enter an integer: ");
        System.out.print("The factors are: ");
        Scanner k = new Scanner(System.in);
        num = k.nextInt();
        for(int i=1;i<=(num/2);i++)
        {
            if(num%i==0)
                System.out.print(""+i+", ");
        }
        System.out.println(num);
    }
}
