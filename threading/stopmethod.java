//the stop method is used to stop a method permentally. 

class Thread1 extends Thread {
public void run(){
String name=Thread.currentThread().getName();
for(int i=1;i<=3;i++){
System.out.println(name);
}
}
}
class Thread2 extends Thread {
public void run(){
String name=Thread.currentThread().getName();
for(int j=1;j<=3;j++){
System.out.println(name);
}
}
}
class B{
public static void main(String[] args){
Thread1 t=new Thread1();
Thread2 t1=new Thread2();
t.setName("Thread1");
t1.setName("Thread2");
t.start();

//t.stop();
try{
t.interrupt();
}
catch(Exception e){

}
t1.start();
}
}
