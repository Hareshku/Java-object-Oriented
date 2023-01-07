class S{
String name,Id,dept;
void setdata(String n,String id, String d){
name=n;
Id=id;
dept=d;
}
void getdata(){
System.out.println(name);
System.out.println(Id);
System.out.println(dept);
}
}
 class D{
public static void main(String[] args){
S s1=new S();
s1.setdata("Hk","21sw04","sw");
s1.getdata();
}
}