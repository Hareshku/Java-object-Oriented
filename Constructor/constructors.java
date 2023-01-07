class D{
String id;
String name;
String dept;
String District;
String provience;
String Uni; 
D(){
id="21sw053";
name="Haresh kumar";
dept="Software Engineering";
District="Umerkot";
provience="Sindh";
Uni="Mehran University of engineering and technology Jamshoro";
}
void Show(){
System.out.println("id is:\t"+id);
System.out.println("name is:\t"+name);
System.out.println("department is:\t"+dept);
System.out.println("District is:\t"+District);
System.out.println("provience is:\t"+provience);
System.out.println("university Name is:\t"+Uni);
}
}
class B{
public static void main(String[] args)
{
D s1=new D();
s1.Show();
}
}

