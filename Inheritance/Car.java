public class Car extends Vehicle{

    String color;
    
    // Method Overriding
    void start(){
        // this keyword is used to take reference of that instance or object which is currently implementing
        System.out.println(this);
        System.out.println(this.model+" Car is starting");
    }
     
    public static void main(String args[]){
        Car c1 = new Car();
        c1.wheelcounts = 4;
        c1.model = "abcde";
        c1.color = "red";
        c1.start();

        Car c2 = new Car();
        c2.model = "ghijk";
        c2.start();

        Car c3 = new Car();
        c3 .model = "gchjeu";
        c3.start();

        // Here we can see that this keyword working as it take the reference of particular instance
    }
}