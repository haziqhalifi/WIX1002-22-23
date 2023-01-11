
package W6;
import java.util.Scanner;
public class T6Q1e {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter a word/sentence : ");
        String sent = key.next();
        numberletter(sent);
        numberdigit(sent);
    }
    
    public static void numberletter(String sent) {
        char temp;
        int charCount=0;
    
        for (int i = 0; i < sent.length(); i++) {
        temp = sent.charAt(i);

        if (Character.isLetter(temp)) {
            charCount++;
        }
        }
        System.out.println("Number of letter is "+charCount);
    }

    public static void numberdigit(String sent) {
        char temp;
        int digitCount=0;
    
        for (int i = 0; i < sent.length(); i++) {
        temp = sent.charAt(i);

        if (Character.isDigit(temp)) {
            digitCount++;
        }
        }
        System.out.println("Number of digit is "+digitCount);
    }
}
