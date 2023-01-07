class S{
String id,name,dept;
S(){
id="21sw0";
name="Hk";
dept="sw";
System.out.println(id);
System.out.println(name);
System.out.println(dept);
}

S(S ref){
id=ref.id;
name=ref.name;
dept=ref.dept;
System.out.println(id);
System.out.println(name);
System.out.println(dept);
}
}
class D{
public static void main(String[] args){
S s1=new S();
S s2=new S(s1);
}
}