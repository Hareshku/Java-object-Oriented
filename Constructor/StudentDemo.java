class Student {
    String sId;
    String sname;
    String sdept;
    Student(){
        sId="21SW053";
        sname= "Haresh kumar";
        sdept= "Software";       
    }
    Student(String id, String name, String dept){
        sId=id;
        sname= name;
        sdept= dept;
    }
    Student(Student s){
        this.sId=s.sId;
        this.sname = s.sname;
        this.sdept = s.sdept;

    }
    Student ChangeAttributes(Student s){
        s.sId = "21SW";
        s.sname = "changed name";
        s.sdept = "cs";
        return s;

    }
    void display(){
        System.out.println(sId);
        System.out.println(sname);
        System.out.println(sdept);
    }
}
class StudentDemo{
    public static void main(String[] args ){
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("21TL099","Sheikh","TL");
        s2.display();
        Student s3 = new Student(s2);
        s3.display();
        Student s4 = s3.ChangeAttributes(s3);
        s4.display();
    }
}