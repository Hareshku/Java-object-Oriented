class VideoPlay extends Thread {
public void run(){
System.out.println("Videos are playing");
}
}
class MusicPlay extends Thread {
public void run(){
System.out.println("Music is Playing");
}
}
 class TaskBar extends Thread {
public void run(){
System.out.println("task bar is Exicuting");
}
}
class Testt{
public static void main(String[] args){
VideoPlay v=new VideoPlay();
v.start();
MusicPlay m=new MusicPlay();
m.start();
TaskBar t=new TaskBar();
t.start();
}
}