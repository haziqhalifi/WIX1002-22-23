package W4;
import java.util.Scanner;
public class L4Q3 {
    public static void main(String[] args) {
        int score=0, max=0, min=0, total=0;
        
        while(score>=0){
        
        System.out.println("Enter a score [negative score to quit]:");
        Scanner k = new Scanner(System.in);
        score = k.nextInt();
        if (score>0)
        {
            total+=score;
        if(score>max)
            max=score;
        if(score<min)
            min=score;
        
        }}
        System.out.println(total);
        System.out.println(max);
        System.out.println(min);
    
}}
