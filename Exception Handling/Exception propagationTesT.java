class TesT{
void m(){
int data=50/0;
}
void n(){
m();
}
void p(){
n();
}
void f()
{
try{
p();
}
catch(Exception e){
System.out.println("Exception Handled");
}
}
public static void main(String[] args){
TesT t=new TesT();
t.f();
System.out.println("Here is solution");
}
}