class A{
String Id,name,dept,Uni;
void display(String id,String n,String d){
Id=id;
name=n;
dept=d;
System.out.println(Id);
System.out.println(name);
System.out.println(dept);
}
void display(String id,String n,String d,String uni){
Id=id;
name=n;
dept=d;
Uni=uni;
System.out.println(Id);
System.out.println(name);
System.out.println(dept);
System.out.println(Uni);
}

public static void main(String[] args){
A s1=new A();
s1.Show("21sw053","Hk","SW");
s1.display("21sw053","Hk","SW","Mehran");
}
}