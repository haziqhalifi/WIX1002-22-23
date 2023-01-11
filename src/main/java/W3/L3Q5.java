package W3;
import java.util.Scanner;
public class L3Q5 {
    public static void main(String[] args) {
        int a,b,c,d,e,f;
        double x,y;
        System.out.println("Based on linear equation below:\nax + by = e, cx + dy = f;");
        System.out.println("Enter values of a, b, c, d, e & f: ");
        Scanner keyboard = new Scanner(System.in);
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();
        d = keyboard.nextInt();
        e = keyboard.nextInt();
        f = keyboard.nextInt();
        
        //x = (ed-bf)/(ad-bc) 
        //y=(af-ec)/(ad-bc)
        
        if((a*d-b*c)==0)
            System.out.println("The equation has no solution");
        
        x = (float)(e*d-b*f)/(a*d-b*c);
        y = (float)(a*f-e*c)/(a*d-b*c);
        System.out.printf("X:%.2f\tY:%.2f",x,y);
        
    }
}
