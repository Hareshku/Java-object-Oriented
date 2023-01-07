class Student{
String id,name,dept;
Student(){
id="21sw0";
name="Hk";
dept="sw";
}
Student(String i, String n, String d)
{
id=i;
name=n;
dept=d;
}
Student(Student ref){
this.id=ref.id;
this.name=ref.name;
this.dept=ref.dept;
}

void display(){
System.out.println(id);
System.out.println(name);
System.out.println(dept);
}
}
class K{
public static void main(String[] args){
Student s1=new Student();
s1.display();
Student s2=new Student("21sw8","Sk","Me");
s2.display();
Student s3=new Student(s2);
s3.display();
}
}