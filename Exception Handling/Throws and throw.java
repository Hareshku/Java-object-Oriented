/*class  A {
 static void Val(int age){
if(age<18)
throw new ArithmeticException("No");
else
System.out.println("yes");
}
public static void main(String[] args){
Val(12);
System.out.println("see");
}
}



//Throws keyword.

class A {
void show() throws ArithmeticException {
int a=2,b=0;
int c=a/b;
System.out.println(c);
System.out.println("hello");
}
void F() throws ArithmeticException{
show();
}
void D(){
try {
F();
}
catch(Exception e){
System.out.println("Exception handled");
}
}
public static void main(String[] args){
A a=new A();
a.D();
System.out.println("Exception Handled");
}
}*/
class InvalidAgeException  extends Exception{
InvalidAgeException(String s){
super(s);
}
}
class A {
public  static void show(int age){
if(age<19){
throw new InvalidAgeException("invalid age");
}
else{
System.out.println("hfs");
}
}
public static void main(String[] args){
try{
show(12);
}
catch(Exception e){
}
system.out.println("hjhreu");
}
}
