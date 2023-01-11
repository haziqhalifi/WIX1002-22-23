
package W6;
import java .util.Scanner;
public class T6Q1c {
    
    public static void main(String[] args) {
        int n,k;
        
        Scanner key = new Scanner (System.in);
        System.out.println("Enter value n & k: ");
        n = key.nextInt();
        k= key.nextInt();
        System.out.println("Combination function is "+combination(n,k));
        
    }
    public static int combination(int n, int k) {
        int nfac=1, kfac=1, nkfac=1, nk;
        
        for(int i=n;i>0;i--){
            nfac*=i;
        }
        
        for(int i=k;i>0;i--){
            kfac*=i;
        }
        
        nk=n-k;
        
        for(int i=nk;i>0;i--){
            nkfac*=i;
        }     
        
        return nfac/(kfac*nkfac);        
    }
}
