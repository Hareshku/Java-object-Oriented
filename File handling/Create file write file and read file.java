import java.io.*;
/*
import java.io.IOException;
class Main{
public static void main(String[] args) throws IOException {
File f=new File("C Drive.txt");
f.createNewFile();
}
}*/


/*
class Main{
public static void main(String[] args){
String data="this is way to write something into the file";
try{
FileOutputStream output=new FileOutputStream("C Drive.txt");
byte [] a=data.getBytes();
output.write(a);
output.close();
}
catch(Exception e){
e.printStackTrace();
}
}
}
*/

class Main{
public static void main(String[] args){
try{
FileInputStream input=new FileInputStream("C Drive.txt");
System.out.println("Read data from the File");
int i =input.read();
while(i != -1){
System.out.print((char)i);
i=input.read();
}
input.close();
}
catch(Exception e){
e.printStackTrace();
}
}
}