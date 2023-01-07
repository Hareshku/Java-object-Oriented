import java.lang.Exception;
class Excep2{
	public static void main(String [] args){
		try {
		System.out.println(2/0);
		//throw new ArrayIndexOutOfBondException();
		
	} catch (Exception e) {
		System.out.println(e);
	}
	try{
		throw new NullPointerException();
	}	catch (Exception e) {
		System.out.println(e);
	}
	try{
		throw new ArrayIndexOutOfBoundsException();

	}catch (Exception e) {
	System.out.println(e);	
	}
}
}
