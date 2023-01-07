
//taking an input from the user and storing it into array'.

import java.util.Scanner;
class G{
public static void main(String[] args){
Scanner se=new Scanner(System.in);
int size=se.nextInt();
int numbers[]=new int[size];

//Here we take one integer number as an input from the integer size and then store it into numbers[i].
for(int i=0;i<size;i++){
numbers[i]=se.nextInt();
}
//output
System.out.println("this is output");
for(int i=0;i<size;i++){
System.out.println(" \n       "+numbers[i]);
}
}
}
