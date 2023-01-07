/*import java.io.*;
class Output{
public static void main(String[] args){
try{
FileInputStream input=new FileInputStream("BankingSystem.java");
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
}*/




import java.io.*;

import java.io.IOException;
class Output{
public static void main(String[] args) throws IOException {
File f=new File("input.txt");
f.createNewFile();
}
}


/*

import java.io.*;
class Output{
public static void main(String[] args){
String data="this is way to write something into the file";
try{
FileOutputStream output=new FileOutputStream("File.txt");
byte [] a=data.getBytes();
output.write(a);
output.close();
}
catch(Exception e){
e.printStackTrace();
}
}
*/