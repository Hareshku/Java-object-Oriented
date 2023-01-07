import java.util.Scanner;
import java.lang.Exception;	
class Excep3 {
	public static void main(String[] args) throws NegativeException{
	Scanner s = new Scanner(System.in);
	try{
		System.out.print("Enter the number greater than 0: ");
		int num=s.nextInt();
	if(num<0){
		throw new NegativeException();
	}
}
	catch(Exception e){
		System.out.println(e);	
	}
	}
}
class NegativeException extends Exception{
}
