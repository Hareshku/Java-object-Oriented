class Test extends Thread{
public  void run() {

for(int i=1;i<=5;i++){
try{
System.out.println(i);
Thread.sleep(1000);
}
catch(Exception e){
System.out.println(e);
}
}
}
public static void main(String[] args){
Test t=new Test();
t.run();
System.out.println("lets Start");

}
}