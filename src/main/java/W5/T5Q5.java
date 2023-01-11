
package W5;

public class T5Q5 {
    public static void main(String[] args) {
        String[]name= {"Ali bin Abu","Syafi bin Syabu"};
        for(int i = 0;i<name.length;i++)
        {
            for(int j = name[i].length()-1;j>=0;j--)
            {
                System.out.print(name[i].charAt(j));
            }     
            System.out.println("");
        }
}}
