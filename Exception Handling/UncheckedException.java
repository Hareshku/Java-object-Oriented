// UncheckedException  or run time Exception  ArithmeticException

/*import java.io.*;

class UncheckedException{
public static void main(String[] args){
int a=2,b=0,c;
c=a/b;
System.out.println(c);
}
*/


/*/ handling of Unchecked Exception ArithmeticException
import java.io.*;

class UncheckedException{

public static void main(String[] args){
try{
int a=2,b=0,c;
c=a/b;
System.out.println(c);
}
catch(Exception e){
e.printStackTrace();
}
System.out.println("Exception handled");
}
}
*/



/*/NullPointerException
import java.io.*;

class UncheckedException{

public static void main(String[] args){
String s=null;
System.out.println(s.length());
}
}
*/


/*/ Handling of null pointer Exception

import java.io.*;

class UncheckedException{

public static void main(String[] args){
try{
String s=null;
System.out.println(s.length());
}
catch(Exception e){
e.printStackTrace();
}
System.out.println("Exception Handled");
}
}*/


//Unchecked or run time exception handling

/*/ArrayIndexOutOfBoundsException:
import java.io.*;
class CheckedEx{

public static void main(String[] args){
try{
int[] a={2,4,5,6,7};
System.out.println(a[6]);
}
catch(Exception e){
e.printStackTrace();
}
System.out.println("CheckedException");
}
}
*/


/*
import java.util.Scanner;
class YoungerAgeException extends RuntimeException {
YoungerAgeException(String m){
super(m);
}
}*/
import java.util.Scanner;
class UncheckedException {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter your age  ");
int age=s.nextInt();
try{
if(age<18){
throw new YoungerAgeException("You  cant vote: ");
}
else{
System.out.println("you can vote:");
}
}
catch(Exception e){
System.out.println(e);
}
}
}
