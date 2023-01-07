class S extends Thread {
public void run(){

for(int i=1;i<=11;i++){
try{
Thread.sleep(1000);
if(i==11){
System.out.println("time out");
break;
}

System.out.println(i);
}

catch(Exception e){
System.out.println(e);
}
}
}
public static void main(String[] args){
S s=new S();
System.out.println("Your time starts now");
s.start();
}
}