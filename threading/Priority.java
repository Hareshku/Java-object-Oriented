class A extends Thread {
public void run(){
System.out.println("name "+Thread.currentThread().getName());
System.out.println("priority "+Thread.currentThread().getPriority());
}
}
class B {
public static void main(String[] args){
A t=new A();
A t2=new A();
A t3=new A();
t.setName("thread1");
t.setPriority(2);
t2.setName("Thread2");
t2.setPriority(8);
t3.setName("thread3");
t3.setPriority(9);

t.start();
t2.start();
t3.start();
}
}
