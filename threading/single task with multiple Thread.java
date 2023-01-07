
class TestThread extends Thread {
public void run(){
int a=4,b=6;
int c=a+b;
System.out.println(c);
System.out.println("Extending Thread class");
}
public static void main(String[] args){
TestThread t=new TestThread();
t.start();
TestThread t2=new TestThread();
t2.start();
TestThread t3=new TestThread();
t3.start();
}
}