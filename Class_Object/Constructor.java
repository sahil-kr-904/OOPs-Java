class Complex{ // It is an example of creating custom data type
    int real;
    int imaginary;

    // Constructor overloading

    public Complex(){
        System.out.println("A complex number created with 0 initial values");
    }

    public Complex(int real,int imaginary){
        this.real = real; // this keyword refers to the same object
        this.imaginary = imaginary;
    }

    void print(){
        System.out.println(real+" + "+imaginary+"i");
    }

    void add_print(Complex num){
        int real_sum = this.real + num.real;
        int img_sum = this.imaginary + num.imaginary;
        System.out.println(real_sum+" + "+img_sum+"i");
    }

    public static Complex add(Complex num1,Complex num2){
        return new Complex((num1.real)+(num2.real),(num1.imaginary)+(num2.imaginary));
    }
}

public class Constructor{
    public static void main(String args[]){
        // Complex num1 = new Complex();
        // Complex num2 = new Complex(3,5);
        // num1.print();
        // num2.print();
        Complex num3 = new Complex(1,2);
        Complex num4 = new Complex(10,4);
        num3.add_print(num4);
        Complex num5 = Complex.add(num3,num4);
        num5.print();
    }
}