package W5;
import java.util.Scanner;
public class L5Q1 {
    public static void main(String[] args) {
        int N, max=-1, sum=0, min=101;
        double ave;
        System.out.println("Enter number of students: ");
        Scanner k = new Scanner(System.in);
        N = k.nextInt();
        int[]student = new int[N];
        System.out.println("Student\tScore");
        for(int i=0;i<N;i++)
        {
            student[i]= (int)(Math.random()*101);
            System.out.println((i+1)+"\t"+student[i]);
            sum+=student[i];
            if (student[i]>max)
                max=student[i];
            if (student[i]<min)
                min=student[i];
        }
        ave=(double)sum/N;
        System.out.printf("Average score is %.2f",ave);
        System.out.println("\nmaximum score is "+max);
        System.out.println("minimum score is "+min);
        
    }
}
