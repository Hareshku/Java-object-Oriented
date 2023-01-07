import java.io.*;

import java.io.IOException;
class file{
public static void main(String[] args) throws IOException {
File f=new File("input.txt");

f.createNewFile();

}
}
/*
class file{
public static void main(String[] args){
String data="File output Streaming";
try{
FileOutputStream output=new FileOutputStream("sample.txt");
byte[] a=data.getBytes();
output.write(a);
output.close();
}
catch(Exception e){
e.printStackTrace();
}
}
}
*/