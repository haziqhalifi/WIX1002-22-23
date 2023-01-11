
package W11;

public class L9Q2 {
    
    
    
    public static void main(String[] args) {
        PersonFile a = new PersonFile("loki","L","1/1/1");
        a.display();
    }
}

class PersonFile{
    String name,gender, dateOfBirth;

    public PersonFile(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }
    
    void display(){
        System.out.print(this.name);
    }
}