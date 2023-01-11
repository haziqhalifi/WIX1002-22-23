
package W5;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class L5Q5 {
    public static void main(String[] args) {
        int[]num = new int[20];
        Random r = new Random();
        System.out.println("A list of 20 random integer within 0 to 100");
        for(int i=0;i<20;i++)
        {
            num[i]= r.nextInt(101);
            System.out.print(num[i]);
            if(i<19)
                System.out.print(", ");
            num[i]*=-1;
        }
        
        //descending order
        System.out.println("");
        System.out.println("Array in decending order");
        Arrays.sort(num);
        for(int j=0;j<20;j++)
        {
            num[j]*=-1;
            System.out.print(num[j]); 
            System.out.print(j==19? " ":", ");
        }
        System.out.println("");
        System.out.println("Enter a number to search: ");
        Scanner key = new Scanner(System.in);
        int input;
        input = key.nextInt();
        
                for(int i=0;i<20;i++)
        {
            if(input == num[i])
            {
                System.out.println(input+" found");
                break;
            }
            else
            {
                System.out.println(input+" not found");
                break;
            }              
           
                
        }
        //linear search
        for(int i=0;i<20;i++)
        {
            if(input == num[i])
            {
                System.out.println("linear Search - " +i+" loop(s)");
                break;
            }
        }
        //binary serach
         int left= 0;
         int right = 19;
         int mid;
         int loop = 0;
         while (left <= right) {
            mid = left + (right-left)/ 2;
            if(num[mid]==input)
            {
                loop++;
                break;               
            }
            else if (input < num[mid]) 
            {
                left = mid + 1;
                loop++;
            }
            else 
            {
                right = mid - 1;
                loop++;
            }
        }
        System.out.println("Binary Search - "+loop+" loop(s)");

}}
