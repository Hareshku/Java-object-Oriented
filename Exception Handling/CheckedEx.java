/*//checked or compile time exception
import java.io.*;
class CheckedEx{


public static void main(String[] args){
FileInputStream input=new FileInputStream("output.text");
System.out.println("CheckedException");
}
}
*/




/*/checked or compile time exception handling
//FileNotFoundException.
import java.io.*;
class CheckedEx{

public static void main(String[] args){
try{
FileInputStream input=new FileInputStream("output.text");
}
catch(FileNotFoundException e){
e.printStackTrace();
}
System.out.println("CheckedException");
}
}*/



//class not found Exception
package com.journaldev.exceptions;

public class DataTest {

  public static void main(String[] args) {
    try {
      Class.forName("com.journaldev.MyInvisibleClass");

      ClassLoader.getSystemClassLoader().loadClass("com.journaldev.MyInvisibleClass");

      ClassLoader.getPlatformClassLoader().loadClass("com.journaldev.MyInvisibleClass");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

}
