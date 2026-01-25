public class Car extends Vehicle{

    String color;
    
    void start(){
        System.out.println(this.model+" Car is starting");
    }

    // void accelerate(){
    //     System.out.println("Car is accelerating");
    // } Method can't be overriden bcoz parent class has final method
     
    public static void main(String args[]){
        Car c1 = new Car();
        c1.wheelcounts = 4;
        c1.model = "abcde";
        c1.color = "red";
        c1.start();
        c1.accelerate();
    }
}

// final class cannot be inherited from other classes