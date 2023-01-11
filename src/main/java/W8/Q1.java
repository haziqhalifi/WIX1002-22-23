
package W8;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        String[] names = {"Daniel Liang   Introduction to Java Programming  9780136520238", "Cay Horstmann  Core Java: Fundamentals   9780135166307", "Joshua Bloch  Effective Java  9780134685991", "Herbert Schildt  Java: A Baginner's Guide  9781260440218", "Kathy Sierra  Java : Head First  9780596009206"};
        System.out.println("Author\t\t\tTitle\t\t\t\tISBN");
        Arrays.sort(names);
               for (String name : names) {
                     System.out.println(name);
         
        System.out.println("Author\t\t\tTitle\t\t\t\tISBN");
        String[] titles = {"Introduction to Java Programming", "Core Java: Fundamentals", "Effective Java ", "Java: A Baginner's Guide ", "Java : Head First  "};
        Arrays.sort(names);
            for (String title : titles) {
                System.out.println(title);
        }       
    }
}
}