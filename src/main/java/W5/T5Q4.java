
package W5;

public class T5Q4 { 
    public static void main(String[] args) {
        String[]sentence={"the apple and the the  orange is delicious","Abu buy new car the"};
        int  index;
for(int i=0;i<sentence.length;i++)
{
    index=0;
    int counter=0;
    while((index=sentence[i].indexOf("the",index))!=-1)
    {
	index++;
	counter++;
    }
    System.out.println("The number of occurrence of the word \"the\" is "+counter);
}

   }
}
