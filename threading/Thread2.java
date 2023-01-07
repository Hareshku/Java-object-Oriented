class Thread3 extends Thread2 implements Runnable {
int sq;
Thrsead3(int i){
sq = i*i;
}
Thread3(){
}
public void run(){
System.out.println(sq*sq);
}

public static void main(String[] args){
Thread2 t=new Thread2();
t.start();
}
}
class Thread2 extends Thread {

public  void run(){
for(int i=1,j=10000;i<=100;i++,j++){

System.out.println(j +"  "+ i);
Thread3 t3 = new Thread3(j);
t3.start();
j++;

}
}
}



   