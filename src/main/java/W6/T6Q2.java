/* Write a program that consists of a method 
that can display three numbers in decreasing order */

package W6;

import java.util.Scanner;
public class T6Q2 {
     
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int num1 = key.nextInt();
        int num2 = key.nextInt();
        int num3 = key.nextInt();
        arrangedecreasing(num1, num2, num3);
    }
    
    public static void arrangedecreasing(int num1, int num2, int num3)
    {
        if(num1<num2)
    {
    int temp = num1;
    num1 = num2;
    num2 = temp;
    }

    if(num1<num3)
    {
    int temp = num1;
    num1 = num3;
    num3 = temp;
    }

    if(num2<num3)
    {
    int temp = num2;
    num2 = num3;
    num3 = temp;
    }
        System.out.println("Descending order:\n"+num1+", "+num2+", "+num3);
    }
}
