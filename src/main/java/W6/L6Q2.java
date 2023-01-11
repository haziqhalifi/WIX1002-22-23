package W6;
import java.util.Scanner;
public class L6Q2 {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = input.nextInt();
        System.out.println("Enter character c: ");
        char c = input.next().charAt(0);
        multiPrint(n,c);
        System.out.println("Triangle: ");
        triangle(n,c);
        System.out.println("Diamond: ");
        diamond(n,c);
    }
    static void multiPrint(int n, char c){
        for (int i=1;i<n;i++)
            System.out.print(c+ " ");
        System.out.println("");
    }
    
public static void triangle(int n, char c){
    for(int i=1;i<=n;i++)
    {
        for(int j=n;j>=i;j--)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++)
        {
            System.out.print(c+" ");
        }
        
        System.out.println("");
    }
}
public static void diamond(int n, char c){
    //upper triangle
    for(int i=1;i<=n;i++)
    {
        for(int j=n;j>=i;j--)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++)
        {
            System.out.print(c+" ");
        }
        
        System.out.println("");
    }
    
    //lower triangle
    for(int i=2;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(" "); //space
        }
        for(int k=n;k>=i;k--)
        {
            System.out.print(c+" "); //output
        }
        
        System.out.println("");
    }
}
}

