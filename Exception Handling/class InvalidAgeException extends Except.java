class InvalidAgeException extends Exception {
    InvalidAgeException(String ms){
        Super(ms);
    }
}
public static void main(String[] args) {
    try{
    
    vote()
    }
    catch(InvalidAgeException e){
        System.out.println(e);
    }
    System.out.println("Exception Handled");
}
public static void vote(int age) throws InvalidAgeException {
if(age<18){
throw new InvalidAgeException(" You cant vote");
}
else{
    System.out.println("You can vote");
}
}