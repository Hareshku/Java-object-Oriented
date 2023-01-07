/*class Add{
int add(int a,int b){
return a+b;
}
int add(int d,int c,int e){
return d+c-e;
}
int add(int a,int b,int c,int w){
return a+b+c*w;
}
public static void main(String[] args){
Add a1=new Add();
System.out.println(a1.add(4,6));
System.out.println(a1.add(9,3,3));
System.out.println(a1.add(4,8,8,2));
}
}*/
class Add{
public static void main(String[] args){
float s=0;
for(int i=0;i<args.length;i++)
s=s+Float.parseFloat(args[i]);
System.out.print(s);

}
}
