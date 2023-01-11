
package W6;

public class L6Q4 {
    public static void main(String[] args) {
        System.out.println(    GCD(24, 8)); //8
        System.out.println(    GCD(200, 625)); // 25?
    }
    
    public static int GCD(int a, int b){
        if (b == 0) {return a;}
        else {return GCD(b, a%b);}
    };

    public static void xGCD(int a, int b){
    	//if a>b, a=x , if a<b, b=x
        
    	int x, y;
    	if (a>b){
        	x = a; y = b;
    	} else {
        	x = b; y = a;
    	}
        // x is always greater than y
        
        int r1 = y, r2 = x%y;
        while (r2 != 0){
            int hold = r2;
            r2 = r1%r2;
            r1 = hold;
        }
        System.out.println(r1);
    }
    
}
