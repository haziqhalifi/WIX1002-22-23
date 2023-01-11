
package W6;

public class L6Q1 {
    
    public static void main(String[] args) {
        int n=20;       
        System.out.println("First 20 triangular numbers is "+triangularnumber(n));
    }
    
    public static int triangularnumber(int n){
        n=0;
        for(int i=0;i<=20;i++)
        {
            n+=i;
            System.out.println(n);
        }
        return n;
    }
}
