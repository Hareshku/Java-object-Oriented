class add{
int add(int a,int b){
return a+b;
}
int add(int a,int b,int c){
return a+b+c;
}
float add(float f){
return f;
}
double add(double d,double c){
return d-c;
}
}
class H{
public static void main(String[] args){
add a1=new add();
System.out.println(a1.add(4,5));
System.out.println(a1.add(9,7,6));
System.out.println(a1.add(4.3f));
System.out.println(a1.add(4.55,3.66));
}
}