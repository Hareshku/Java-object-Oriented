
// join method is used to excute a particular thread completely. then it move to the other thread 
class A extends Thread {
    public void run(){
        String name=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(name);
        }
    }
}
class B{
public static void main(String[] args) {
    
A a=new A();
A a1=new A();
A a2=new A();
a.setName("thread 1");
a1.setName("thread 2");
a2.setName("thread 3");
a.start();
try{
    a.join();
}
catch(Exception e){
    System.out.println(e);

}
a1.start();
a2.start();
    }
}