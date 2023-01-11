
package W3;
import java.util.Random;
public class L3Q2 {
    public static void main(String[] args) {
        int num;
        Random random = new Random();
        num = random.nextInt(6);
        switch(num)
                {
                    case 0: System.out.printf("%d is zero",num);
                            break;
                    case 1: System.out.printf("%d is one",num);
                            break;
                    case 2: System.out.printf("%d is two",num);
                            break;
                    case 3: System.out.printf("%d is three",num);
                            break;
                    case 4: System.out.printf("%d is four",num);
                            break;
                    case 5: System.out.printf("%d is five",num);
                            break;
                }
}
}
