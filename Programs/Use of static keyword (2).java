class R{
private static int y=9;
static void fun(){
y=4;
System.out.println(y);
}
public static void main(String[] args){
System.out.println(R.y);
R.fun();
}
}