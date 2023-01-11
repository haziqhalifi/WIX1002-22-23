
package W7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class L7Q1 {
    public static void main(String[] args) throws Exception {
        readmain(args);
    }
    
    public static void writemain(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("coursename.dat");
        DataOutputStream dout = new DataOutputStream(fout);
        dout.writeUTF("WXES1116");
        dout.writeUTF("Programming I");
        dout.writeUTF("WXES1115");
        dout.writeUTF("Data Structure");
        dout.writeUTF("WXES1110");
        dout.writeUTF("Operating System");
        dout.writeUTF("WXES1112");
        dout.writeUTF("Computing Mathematics I");
        dout.writeUTF("END");
        dout.close();
    }
    
    public static void readmain(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("coursename.dat");
        DataInputStream din = new DataInputStream(fin);
        
        ArrayList<String> courseCodes = new ArrayList<>();
        ArrayList<String> courseNames = new ArrayList<>();
        
        while(true){
            String courseCode = din.readUTF();
            if (courseCode.equals("END")){
                break;
            }
            
            String courseName = din.readUTF();
            courseCodes.add(courseCode);
            courseNames.add(courseName);
        }
        
        Scanner key = new Scanner(System.in);
        
        while(true){
        System.out.println("Enter the course code (-1 to exit) : ");
        String courseCodeInput = key.nextLine();
        if(courseCodeInput.equals("-1")){
            break;
        }
        boolean found = false;
            for (int i = 0; i < courseCodes.size(); i++) {
                if(courseCodes.get(i).equals(courseCodeInput)){
                    System.out.println(courseCodeInput +"  : "+ courseNames.get(i));
                    found = true;
                }
            }
            if (!found){
                System.out.println("Try enter the code again");
            }
        }            
    }
}


