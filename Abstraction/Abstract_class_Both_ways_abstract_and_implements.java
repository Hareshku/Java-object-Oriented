//Abstration throw extending abstract class
/*abstract class A{
    abstract void run();
}
class B extends A{
public void run(){
    System.out.println("class a is parent class");

}
public static void main(String[] args) {
    B b=new B();
    b.run();
}
}*/

//by implementing interface
/*interface A{
    void draw();
    }
class B implements A{
public void draw(){
    System.out.println("this is B class");
}
}
class C implements A{
    public void draw()
    {
        System.out.println("this is class c");
    }
    public static void main(String[] args) {
        C c=new C();
        c.draw();

    }
}*/


/*                    one class can implement more than one class
interface A{
    void print();

}
interface B{
    public void show();
}
interface D{
    void disolay();
}
class C implements A,B,D {
    public void print(){
        System.out.println("This is A class method");
      
    }
    public void show(){
        System.out.println("this is B class Method");
    }
    public void display(){
        System.out.println("this is Class D");
    }
    public static void main(String[] args) {
        C c=new C();
        c.print();
        c.show();
        c.display();
    }
}

*/