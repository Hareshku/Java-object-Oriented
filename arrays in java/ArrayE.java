import java.util.*;
class ArrayE{
public static void main(String[] args){
int[] a={4,7,5,1,3};
System.out.println("old Array");
for(int i=0;i<a.length;i++){
System.out.print(a[i]);
System.out.print("\n");
}
System.out.println("new Array");
for(int j=1;j<=7;j++){
if(j==2||j==6){
continue;
}
System.out.print(" "+j);
}
}
}