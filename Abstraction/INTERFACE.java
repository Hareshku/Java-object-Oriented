

interface A{
void Show();
}
class B implements A{
public void Show(){
System.out.println("Hello");
}
}
class C implements A{
public void Show(){
System.out.println("Hi");
}
}
class D implements A{
public void Show(){
System.out.println("Welcom");
}
}
class INTERFACE{
public static void main(String[] args){
B b=new B();
b.Show();
C c=new C();
c.Show();
D d=new D();
d.Show();
}
}