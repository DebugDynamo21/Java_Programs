// Like C++, an abstract class can contain constructors in Java. 
// And a constructor of an abstract class is called when an 
// instance of an inherited class is created. It is as shown in 
// the program below as follows:

package OOPs.Abstraction.AbstractClass;

abstract class Base1{
    //Constructor of class 1
    Base1(){
        System.out.println("Base constructor called");
    }

    abstract void fun();    //abstract method
}

//class 2
class Derived1 extends Base1{
    Derived1(){  //constructor of class 2
        System.out.println("Derived Constructor called");
    }
    
    //method of class 2
    void fun(){
        System.out.println("Derived func() called");
    }
}

// class 3 main class
class p5 {
    public static void main(String[] args){
        //Creating obj of class2 inside main() method
        Derived d = new Derived();
        d.fun();
    }
}
