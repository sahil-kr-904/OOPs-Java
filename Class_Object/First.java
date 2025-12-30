class Dog{
    String name;
    int age;
    String color;

    void walk(){
        System.out.println(name + " is walking");
    }

    void bark(){
        System.out.println(name + " is barking");
    }
}

class Complex{ // It is an example of creating custom data type
    int real;
    int imaginary;

    void print(){
        System.out.println(real+" + "+imaginary+"i");
    }
}

// There will be only one public class
public class First{
    public static void main(String args[]){
        Dog d1 = new Dog();
        d1.name = "Sheru";
        d1.age = 5;
        d1.color = "Brown";
        d1.bark();
        Dog d2 = new Dog();
        d2.name = "Tommy";
        d2.walk();
        Complex num1 = new Complex();
        num1.real = 5;
        num1.imaginary = 6;
        num1.print();
    }
}