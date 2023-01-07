class D{
private String Id;
private String Name;
private String Dept;
void setdata(String id,String n,String d){
Id=id;
Name=n;
Dept=d;
}
String getId(){
return Id;
}
String getName(){
return Name;}
String getDept(){
return Dept;
}

}
class demo{
public static void main(String[] args){
D s1=new D();
s1.setdata("21sw053","Hk","SW");
System.out.println(s1.getId());
System.out.println(s1.getName());
System.out.println(s1.getDept());
}
}