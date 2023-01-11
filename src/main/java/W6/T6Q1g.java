
package W6;
import java.util.Scanner;
public class T6Q1g {
    
    public static void main(String[] args) {
        double [] a = new double[2];
        Scanner key = new Scanner(System.in);
        System.out.println("Enter radius of the circle : ");
        int r = key.nextInt();
        circle(r,a);
        System.out.printf("The area of the circle is %.4f\n", a[0]);
        System.out.printf("The circumference of the circle is %.4f", a[1]);
    }
    
    public static void circle(int r, double a[])
    {
        a[0] = Math.PI*r*r;
        a[1] = 2*Math.PI*r;
    }
}
