/*class A
{
String Id,Name,Dept;

A(String id,String n,String dept){
Id=id;
Name=n;
Dept=dept;
}
void display(){
System.out.println(Id);
System.out.println(Name);
System.out.println(Dept);
}
public static void main(String[] aergs){
A a=new A("21sw","Hk","Sw");
a.display();
}
}*/



/*class A{
A(){System.out.println("constructor");}

public static void main(String[] aergs){
A a=new A();
}
}*/
/*
String id,name;
A(String i,String n){
id=i;
name=n;
}
A(A a){
id=a.id;
name=a.name;
}
void display(){
System.out.println(id);
System.out.println(name);
}
public static void main(String[] args){
A s=new A("21sw053","Haresh");
A d=new A(s);
s.display();
*/




import java.util.Scanner;
class A{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the 1st number      ");
int i=s.nextInt();
System.out.println("Enter the 2nd number   ");
int j=s.nextInt();
int a=i+j;
int b=i-j;
System.out.println("Enter operator   ");
char c=s.next().charAt(0);
switch(c){
case '+':
System.out.println("sum    "+a);
break;
case '-':
System.out.println("subtrsction   "+b);
break;
case '*':
System.out.println("multiply     "+a);
break;
case '/':
System.out.println("division operator");
break;
case '%':
System.out.println("modulus operator");
break;
default:
System.out.println("invalid operator");
break;
}
}
}
