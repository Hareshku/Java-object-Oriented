class  Thread1 extends Thread {
public void run(){
    int a=100;
    for(int i=1OOOO;i<20000;i++){

        System.out.println(++i+" ");
      

    }
}
}
class Thread2 extends Thread {
    public void run(){
        System.out.println(i*i);
    }

public static void main(String[] args){
    Thread1 g=new Thread1();
    g.start();
    Thread2 t=new Thread2();
    t.start();
}
}


    public void run(){
        int a=100;
        for(int i=1OOOO;i<20000;i++){
            System.out.println(++i+" ");
          
    
        }
    }
    public static void main(String[] args) {
        Thread1 t=new Thread1();
        t.start();
    }
}