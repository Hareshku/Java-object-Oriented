/*class M{
public static void validate(int age) throws ArithmeticException {
if(age<18){
throw new ArithmeticException("hhf");
}
else{
System.out.println("hfhr");
}
}


public static void main(String[] args){
try{
validate(10);
}
catch(Exception e){
System.out.println(e);
}
}
}*/
class InvalidAgeException extends Exception {
InvalidAgeException(String s){
super(s);
}
}
public class M{
try{
public static void(int age){
if(age<18){
throw new InvaliAgeWxception("You are Under age");
}

else{
System.out.println("You are eligible");
}
}
catch(Exception e){
System.out.println(e);
}}
}
public static void main(String[] args){
void(12);
}
}