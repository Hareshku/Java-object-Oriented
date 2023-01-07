class E {
static void validate(int age ) throws ArithmeticException {//we use throws to bypass the Exception
if(age< 18)
{
throw new ArithmeticException("You are not eligible");// throw is used to throw the Exception
}
else{
System.out.println("you are Eligible");
}
}
public static void main(String[] args){
try {
validate(20);
}
catch(Exception e){
e.printStackTrace();
}
}
}