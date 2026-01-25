public class Car extends Vehicle{

    String color;

    Car(){
        // super();
        super(3); // Can only be use in constructor body
        System.out.println("Car is being created");
    }
    
    void start(){
        super.start();
        System.out.println(this);
        System.out.println(this.model+" Car is starting");
    }
     
    public static void main(String args[]){
        Car c1 = new Car();
        System.out.println(c1.wheelcounts);
        c1.wheelcounts = 4;
        c1.model = "abcde";
        c1.color = "red";
        System.out.println(c1.wheelcounts);
        c1.start();
    }
}