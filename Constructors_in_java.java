class Student
{
 String name;
 Student(String n) //super class constructor
 {
 name=n;
 }
}

class University extends Student
{
 int age, id;
 University(String c, int a, int i)	
 {
 	super(c); //calling super class constructor 
 	age=a;
 	id=i;
 }

void show()
{
 System.out.println(name);
 System.out.println(super.name);
}
}


public class Super3
{
public static void main(String[] args) {
University u=new University(Lakshmi,19,416);
u.show();
Student stu=new Student();
stu.show();
}
}
