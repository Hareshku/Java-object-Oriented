//This method is used to find out if a thread has actually been started and has yet not terminated.if thread is in runing state then it will return true 
//other wise false


class A extends Thread {
    public void run(){
        System.out.println("hello");
    }
}
class 	B{
public static void main(String[] args) {
    A e=new A();
    e.start();
System.out.println(e.isAlive());
}
}
