class D{
int a;
String b,c;
D(){
a=200;
b="21sw";
c="Sw";
}
D(int d,String f,String g){
a=d;
b=f;
c=g;
}
D(D ref){
a=ref.a;
b=ref.b;
c=ref.c;
}
void display(){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}
class G{
public static void main(String[] args){

D s1=new D();
s1.display();
D s2=new D(300,"xy","Hi");
s2.display();
D s3=new D(s1);
s3.display();
}
}