public class Vehicle{
    int wheelcounts;
    String model;
    final int gears = 6; // final variable or attribute

    public static void main(String args[]){
        Vehicle v1 = new Vehicle();
        System.out.println(v1.gears);
        // v1.gears = 5; Can't be reassigned
    }

    Vehicle(){
        System.out.println("Creating a vehicle instance");
    }

    void start(){
        System.out.println("Vehicle is starting");
    }
    
    // final method
    final void accelerate(){
        System.out.println("Vehicle is accelerating");
    }
}