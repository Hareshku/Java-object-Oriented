class M extends Thread {
    public  void run(){
        for(int i=1;i<=5;i++)
{
    System.out.println(i);
if(i%2==0){
try{

Thread.sleep();
}
catch(Exception e){
    System.out.println(e);
}
}
}
}
class My extends Thread {
    public  void run(){
        for(int j=1;j<=5;j++)
{
    System.out.println(j);
if(j%2==1){
try{

Thread.sleep();
}
catch(Exception e){
    System.out.println(e);
}
}
}
}
class demo{
    public static void main(String[] args){
        M m=new M();
        m.start();
        My n=new MY();
        n.start();
        }
}
