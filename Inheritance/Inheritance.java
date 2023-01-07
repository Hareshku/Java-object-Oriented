//Single inheritance
/*class Animal {
    public void show(){
        System.out.println("I am Animal class");
    }
}
class Dog extends Animal {
public void Show(){
    System.out.println("I am Child class of animal class");
}
}
class BabyDog extends Dog{
    public void shoW(){
        System.out.println("Cat drinks water");
    
    }
public static void main(String[] args) {
    BabyDog c=new BabyDog();
    c.show();
    c.Show();
    c.shoW();
}
}*/
//multilevel inheritance
/*class Animal {
    public void show(){
        System.out.println("I am Animal class");
    }
}
class Dog extends Animal {
public void Show(){
    System.out.println("I am Child class of animal class");
}
}
class BabyDog extends Dog{
    public void shoW(){
        System.out.println("Cat drinks water");
    
    }
public static void main(String[] args) {
    BabyDog c=new BabyDog();
    c.show();
    c.Show();
    c.shoW();
}
}*/


//Herarical inheritance.
class Animal {
    public void show(){
        System.out.println("I am Animal class");
    }
}
class Dog extends Animal {                              // When parent class and child class has same method then then how to access the parent class methods.
Dog(){
super.show();}
public void show(){
    System.out.println("I am Child class of animal class");
}
}
class Cat extends Animal{
    public void Show(){
        System.out.println("Cat drinks water");
    
    }
public static void main(String[] args) {
Dog d=new Dog();
d.show();
    Cat c=new Cat();
    c.Show();
    c.show();
}
}


// super class    when both parent class and child  the class has same Name then we use super keyword to accesses the parent class objects or methods
/*class A{
    String colour="White";
}
class B extends A {
    String colour="Red";
    public void printColour(){
        System.out.println(super.colour+"  Colour of class A");
        System.out.println(colour+"     colour of class B");
    }
    public static void main(String[] args) {
        B b =new B();
        b.printColour();
    }
*/