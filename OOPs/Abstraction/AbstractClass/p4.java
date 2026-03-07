/*In Java, just like in C++ an instance of an abstract class 
cannot be created, we can have references to abstract class 
type though. It is as shown below via the clean Java program. */

package OOPs.Abstraction.AbstractClass;

//Abstract class 1
abstract class Base{
    abstract void fun();
}

// Class 2
class Derived extends Base{
    void fun(){
        System.out.println("Derived fun() called!");
    }
}

// Class 3 main class
public class p4 {
    public static void main(String[] args){
        //// Uncommenting the following line will cause
        // compiler error as the line tries to create an
        // instance of abstract class. 
        // Base b = new Base();
        
        Base b = new Derived();
        b.fun();
    }
}
