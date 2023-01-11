package W5_PS;

import java.util.Scanner;
public class PS1_1 {
    public static void main(String[] args) {
        //input 3 marks
        int x,y;
        String move;
        Scanner key = new Scanner(System.in);
        
        System.out.println("Enter the coordinate X and Y: ");
        x = key.nextInt();
        y = key.nextInt();
        System.out.println("Enter the move: ");
        move = key.next();
        System.out.println("");
        
        //output 1 mark
        System.out.print("Initial Coordinate ("+x+","+y+")");
        
        //loop 2 marks
        for(int i=0;i<move.length();i++)
        {
            switch (move.charAt(i))
            {
                case 'R': 
                    x++;
                    break;
                case 'L': 
                    x--;
                    break;
                case 'U': 
                    x++;
                    break;
                case 'D': 
                    x--;
                    break;
                default : break;
            }
                
        }
        System.out.println("");
        //output 1 mark
        System.out.print("Final Coordinate ("+x+","+y+")");
        
        
    }
 
}
