//use of arraylist in java

import java.util.ArrayList;
import java.util.Collections;
class A{
public static void main(String args[])
{
ArrayList<Integer>list=new ArrayList<Integer>();
list.add(1);
list.add(3);
list.add(4);
list.add(6);
list.add(8);
System.out.println(list);
list.add(2,8);
System.out.println(list);
int i=list.get(4);
System.out.println(i);
int size=list.size();
System.out.println(size);
list.remove(2);
System.out.println(list);
Collections.sort(list);
System.out.println(list);
}
}