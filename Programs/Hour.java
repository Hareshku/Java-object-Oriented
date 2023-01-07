class Clock{
float Hour;
int Minute;
int Second;
void setValue(float h,int m,int s){
Hour=h;
Minute=m;
Second=s;
}
float getHour(){
return Hour;
}
int getMinute(){
return Minute;
}
int getSecond(){
return Second;
}
void conversion(){
Hour=3;
Minute=(int)Hour*60+50;
Second=Minute*60;
}
void reverse(){
Hour=Second/Minute;
Minute=Second/60;
Second=(int)Hour*60+50*60;
}
}
class H{
public static void main(String[] args){
Clock c=new Clock();
c.conversion();
c.reverse();
c.setValue(3f,50,13800);
System.out.println("Hour   = "+c.getHour());
System.out.println("Minute  = "+c.getMinute());
System.out.println("Second  =" +c.getSecond());

}
}