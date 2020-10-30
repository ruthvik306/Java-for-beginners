import java.util.Scanner;
import java.util.Random;
class Student {
    String firstName;  
    String lastName;  
    int admMarks;
    char Section;
    public Student(){
        Random rand = new Random(); 
        this.admMarks = rand.nextInt(101);;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setlLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAdmMarks() {
        return this.admMarks;
    }

    public char getSection() {
        return this.Section;
    }

    public void setSection(char Section) {
        this.Section = Section;
    }

    public Student firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Student lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Student admMarks(int admMarks) {
        this.admMarks = admMarks;
        return this;
    }

    public Student Section(char Section) {
        this.Section = Section;
        return this;
    }

    @Override
    public String toString() {
        return "|" +
            " FirstName='" + getFirstName() + "'" +
            ", LastName='" + getLastName() + "'" +
            ", Marks='" + getAdmMarks() + "'" +
            ", Section='" + getSection() + "'" +
            "|";
    }
    
}

public class AssignMG1076 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rand = new Random(); 
        System.out.println("Enter Number of Students: ");
        int n = inp.nextInt();
        inp.nextLine();
        Student[] student = new Student[n];
        Student current = new Student();
        System.out.println("Enter the First name, Last name and Section of 15 Students:");
        System.out.println("[They will be assigned random marks (0, 100)]");
        System.out.println("First Name and Last Name should be < 20 char");
        for(int i=0;i<n;i++){
          student[i] = new Student();
          current = student[i].firstName("DEFAULT VALUE WITH LENGTH > 20");
          current = student[i].lastName("DEFAULT VALUE WITH LENGTH > 20");
          while(student[i].firstName.length()>20){
            System.out.println("Enter FirstName of Student "+(i+1)+":");
            student[i].firstName = inp.nextLine();
          }
          while(student[i].lastName.length()>20){
            System.out.println("Enter LastName of Student "+(i+1)+":");
            student[i].lastName = inp.nextLine();
          }
            System.out.println("Enter Section of Student "+(i+1)+":");
            student[i].Section = inp.nextLine().charAt(0);
            System.out.println("Marks are: "+student[i].admMarks);
        }
        inp.close(); 
        
        System.out.println("B)\n1)Student Records:");
        for (int i = 0; i < n; i++) {
                System.out.println(student[i].toString());
            }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(student[j].admMarks>student[j+1].admMarks){
                    current=student[j];
                    student[j]=student[j+1];
                    student[j+1]=current;
                } 
            }
        }
         System.out.println("B)\n2)Student Records in sorted order based on marks:");

         for (int i = 0; i < n; i++) {
                System.out.println(student[i].toString());
            }
    
         System.out.println("B)\n3)Student Records in their updated sections:");

    for(int i=0;i<n;i++){
        if(i%3==0){
            student[i].Section='A';
        }
        if(i%3==1){
            student[i].Section='B';
        }
        if(i%3==2){
            student[i].Section='C';
        }
    }
         for (int i = 0; i < n; i++) {
                System.out.println(student[i].toString());
            }
}
}
