
package W3;
import java.util.Scanner;
public class L3Q1 {
    public static void main(String[] args) {
        int num1, num2, total=0,i=0;
        char opr;
        String operator="+-*/%";
        System.out.println("Enter two integer number: ");
        Scanner keyboard = new Scanner(System.in);
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        System.out.println("Enter the operator: ");
        opr = keyboard.next().charAt(0);
        if(opr == '+')
        {
            total=num1+num2;
            i=0;
        }
        else if(opr == '-')
        {
            total=num1-num2;
            i=1;
        }
        else if(opr == '*')
        {
            total=num1*num2;
            i=2;
        }
        else if(opr == '/')
        {
            total=num1/num2;
            i=3;
        } 
        else if(opr == '%')
        {
            total=num1%num2;
            i=4;
        }
        System.out.printf("%d %c %d = %d",num1,operator.charAt(i),num2,total);
    }
}
