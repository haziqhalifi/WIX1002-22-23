package W5;
import java.util.Scanner;
import java.util.Random;
public class L5Q3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int N = keyboard.nextInt();
        int[][]employee = new int[N][7];

        

        for(int i = 0; i < N; i++){
            int sum=0;
            System.out.println("Employee "+(i+1)+":");
            for(int j = 0; j < 7; j++){
                Random rand = new Random();
                employee[i][j] = rand.nextInt(8)+1;
                sum += employee[i][j];
                System.out.printf("Work hour %d: %d\n",j+1, employee[i][j]);
            }
                System.out.printf("The total hours for employee %d is %d hours.\n",i+1, sum);
            
        }
}}


    

