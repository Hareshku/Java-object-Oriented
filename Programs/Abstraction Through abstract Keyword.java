abstract class A{
abstract void Show();
}
class B extends A{
String Name="Haresh";
String Id="21sw053";
String Dept="Software";

void Show(){
System.out.println(Name);
System.out.println(Id);
System.out.println(Dept);
}
}
class C extends A{
String Name;
String Id;
String Dept;
void setData(String n,String id,String d){
Name=n;
Id=id;
Dept=d;
}

String getName(){
return Name;
}
String getId(){
return Id;
}
String getDept(){
return Dept;
}
void Show(){
System.out.println(Name);
System.out.println(Id);
System.out.println(Dept);

}
}
class T{
public static void main(String[] args){
B b=new B();
b.Show();
C c=new C();
c.setData("Sohail","21sw16","Software Engineering");
System.out.println(c.getName());
System.out.println(c.getId());
System.out.println(c.getDept());
}
}