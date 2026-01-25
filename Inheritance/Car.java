public class Car extends Vehicle{

    String color;
    
    void start(){
        Scooter s1 = new Scooter();
        // s1.braking(this);
        System.out.println(this==this.braking());
        System.out.println(this.model+" Car is starting");
    }

    Car braking(){
        return this;
    }
     
    public static void main(String args[]){
        Car c1 = new Car();
        c1.wheelcounts = 4;
        c1.model = "abcde";
        c1.color = "red";
        c1.start();
    }
}

class Scooter{

    void braking(Car car){
        System.out.println(car.model + " is braking");
    }
}