class F{
public static void main(String [] args)
{
int a=4;
byte b= (byte)a;//Narrowing conversion.
int i=5;
float f=i; // Widing conversion.
float g=8.3f;
int d=(int)g;
System.out.println(d);
System.out.println(f);
System.out.println(b);
}
}
