public class Mercedes extends Car{
    
    // Method Overriding
    void start(){
        System.out.println("Mercedes is starting");
    }

    public static void main(String args[]){

        Mercedes m1 = new Mercedes();
        // If start method is not found here in this own class then it will go to immediate parent and then upper immediate parent
        // This is called inheritance chaining
        // The class over root class is object class (top level parent) if method not found there also then gives error
        // Method Overloading also lnown as Compile time polymorphism
        // Method Overriding also known as Run time polymorphism
        m1.start();
    }
}