
package W6;
import java.util.Scanner;
public class L6Q3 {
    
    public static void main(String[] args) {
        int []num = new int[10];
        Scanner key = new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.println("Enter a number : ");
            num[i] = key.nextInt();
        }
        System.out.println("\nBefore : ");
        for(int i=0; i<10; i++){
            String comma = (i==9)? " " : ", ";
            System.out.print(num[i]+""+comma);
            
        }
        System.out.println("");
        reverseorder(num);
     
    }
    
    public static void reverseorder(int num[]){

     for (int i=0; i<10; i++){
         int rev = 0;

      while(num[i] != 0) {
         int digit = num[i] % 10;
         rev = rev * 10 + digit;
         num[i] /= 10;
      }
      num[i] = rev;
        }
    System.out.println("");
    System.out.println("After : ");
    
    for(int i=0; i<10; i++){
    String comma = (i==9)? " " : ", ";
    System.out.print(num[i]+""+comma);   
    }

}
}

