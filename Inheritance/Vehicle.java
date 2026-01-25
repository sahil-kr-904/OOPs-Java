public class Vehicle{
    int wheelcounts;
    String model;

    Vehicle(){
        System.out.println("Creating a vehicle instance");
    }

    Vehicle(int wheelcounts){
        this.wheelcounts = wheelcounts;
        System.out.println("Creating vehicle with wheels");
    }

    void start(){
        System.out.println("Vehicle is starting");
    }
}