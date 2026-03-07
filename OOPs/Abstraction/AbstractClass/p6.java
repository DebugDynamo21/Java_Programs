//In Java, we can have an abstract class without any abstract method. 
// This allows us to create classes that cannot be instantiated but 
// can only be inherited. It is as shown below as follows with help 
// of a clean java program.

package OOPs.Abstraction.AbstractClass;

abstract class Base2{
    //Demo method. This is not an abstract method.
    void fun(){
        //Print message if class 1 function is called.
        System.out.println("Function of Base Class is called");
    }
}

// Class 2
class Derived2 extends Base2{
    // This only onherits base class methods and properties
}

//Class 3 main method
public class p6 {
    // Main driver method
    public static void main(String[] args){
        
        //Creating object of class 2
        Derived2 d = new Derived2();

        // Calling function defned in class 1 inside main()
        // with object of class 2 inside main() method
        d.fun();
    }
}
