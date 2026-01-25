public class Car extends Vehicle{
    
    // Method Overriding
    void start(){
        System.out.println("Car is starting");
    }
     
    public static void main(String args[]){
        Car c1 = new Car();
        c1.wheelcounts = 4;
        c1.start();
    }
}