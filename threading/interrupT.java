
//interrupt method is used when our program is in waiting 
// if program is in running state then we should transfer it in waiting state using sleep(1000); method.
class interrupT extends Thread {
public void run(){
try{
for(int i=1;i<=5;i++){
System.out.println("threading");
Thread.sleep(1000);
}
}
catch(Exception e){
System.out.println("Interrupted method");
}
}

public static void main(String[] args){
interrupT n=new interrupT();
n.start();
n.interrupt();
}
}