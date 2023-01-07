/*class G extends Thread {
public void run(){
String name=Thread.currentThread().getName();
for(int i=1;i<=3;i++){

System.out.println(name);
}
}
}
class F{
public static void main(String[] args){
G g=new G();
G c=new G();
G n=new G();
g.setName("fddyyyt");
c.setName("Feghty");
n.setName("detuiui");
c.start();
try{
c.join();
}
catch(Exception e){
System.out.println(e);
}
n.start();
g.start();
}
}*/
class G extends Thread{
public void run(){
for(int i=1;i<=4;i++){
System.out.println("hi");
}
}
}
class F extends Thread{
public void run(){
for(int j=1;j<=3;j++){

System.out.println("He");
}
}
public static void main(String[] args){
G g=new G();
G c=new G();
F f=new F();
f.setName("H");
g.start();
try{
g.join();
}
catch(Exception e){
System.out.println(e);
}
f.start();
c.start();
}
}