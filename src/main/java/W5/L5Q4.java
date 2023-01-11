package W5;
public class L5Q4 {
public static void main(String args[])  
{  
//matrix to rotate   
int a[][]= {{1,5,7},{3,6,9},{5,3,8}};    
System.out.println("Original Matrix: \n");  

for(int i=0;i<3;i++)  //loop for rows  
{  
for(int j=0;j<3;j++)  //loop for columns 
{  

System.out.print(a[i][j]+"\t");  //prints the elements of the original matrix  
}  
System.out.println("\n");  
}  
System.out.println("Rotate Matrix by 90 Degrees Clockwise: \n");  
for(int i=0;i<3;i++)  
{  
for(int j=2;j>=0;j--)  
{  
//prints the elements of the rotated matrix  
System.out.print(""+a[j][i]+"\t");  
}  
System.out.println("\n");  
}  
}  
}   