package W5;
import java.util.Scanner;
public class L5Q6 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the row of Pascal's triangle to generate: ");
        int N = key.nextInt();
        int[][] tri = new int[N][N];
        
        tri[0][0] = 1;
        for (int i = 1; i < N; i++) {
            tri[i][0] = 1;
            for (int j = 1; j < i + 1; j++) {
                tri[i][j] = tri[i - 1][j] + tri[i - 1][j - 1];
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%d ", tri[i][j]);
            }
            System.out.println("");
        }
    }

    }
 

