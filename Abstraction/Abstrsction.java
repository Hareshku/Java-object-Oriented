/*  Abstraction is a mechnism which hide the implementation from the user in which user only concerned with what program will do 
but its not concern that how it does.
abstraction is achived by two ways 
1.   by abstract class    2.   by interface
by abstract class we achive from (0% to 100%) .      but by interface we achive 100% abstraction.
in abstraction there is no body of METHOD in abstract class.
*/
                                                        






abstract class D{
abstract void Show();
}
class C extends D {
void Show(){
System.out.println("Hello");
}
}
class A extends D{
void Show(){
System.out.println("Hi");
}
}
class F extends D{
void Show(){
System.out.println("He");
}
}
class Hello{
public static void main(String[] args){
C e=new C();
e.Show();
A a=new A();
a.Show();
F f=new F();
f.Show();

}
}
