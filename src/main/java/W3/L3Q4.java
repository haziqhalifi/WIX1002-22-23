package W3;
import java.util.Random;
public class L3Q4 {
    public static void main(String[] args) {
        int p1,p2,i,sum1=0,sum2=0;
        Random random = new Random();
        for(i=1;i<=2;i++)
        {
            p1 = random.nextInt(6)+1;
            p2 = random.nextInt(6)+1;
            sum1+=p1;
            sum2+=p2;
            System.out.printf("Round %d\nP1:%d\tP2:%d\n",i,p1,p2);
        }
        System.out.printf("Result\nP1:%d\tp2:%d",sum1,sum2);
}
}
