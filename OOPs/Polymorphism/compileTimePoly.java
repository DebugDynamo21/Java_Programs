package OOPs.Polymorphism;

class Helper{   // class1: Helper class
    static int Multiply(int a, int b){  // Method with 2 int parameter.
        return a * b;
    }

    static double Multiply(double a, double b){ // Method with 2 double parameter.
        return a * b;
    }
}
public class compileTimePoly {  // main class
    public static void main(String[] args){
        // Calling methods by passing input as in arguments.
        System.out.println("Method 1: a * b = " + Helper.Multiply(2, 4));
        System.out.println("Method 2: a * b = " + Helper.Multiply(3.4, 5.1));
    }
}

// The Multiply method is overloaded with different parameter types. 
// The compiler picks the correct method during compile time based on the arguments.