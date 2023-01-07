//ENCAPSULATION IN JAVA.
class Student{
private String Id;
private String name;
private String dept;
public void Setdata(String id,String n,String d){
Id=id;
name=n;
dept=d;
}
String getId(){
return Id;
}
String getname(){
return name;
}
String getdept(){
return dept;
}
}
class Demo{
public static void main(String[] args){
Student s1=new Student();
s1.Setdata("21sw053","Hk","sw");
System.out.println(s1.getId());
System.out.println(s1.getname());
System.out.println(s1.getdept());
}
}