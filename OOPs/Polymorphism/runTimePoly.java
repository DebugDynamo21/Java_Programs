package OOPs.Polymorphism;

// Helper Class 1
class Parent{
    void Print(){
        System.out.println("This is Parent class");
    }
}

class subclass1 extends Parent{ // Helper Class 2
    void Print(){
        System.out.println("This is subclass1.");
    }
}

class subclass2 extends Parent{ // Helper class 3
    void Print(){
        System.out.println("This is subclass2.");
    }
}

public class runTimePoly {  // Main class
    public static void main (String[] args){
        Parent a;   // Creating obj of class 1.

        // Calling print() method inside main() method
        a = new subclass1();
        a.Print();

        a = new subclass2();
        a.Print();
    }
}

//In the above example, when an object of a child class is created, 
// then the method inside the child class is called. This is because 
// the method in the parent class is overridden by the child class. 
// This method has more priority than the parent method inside the 
// child class. So, the body inside the child class is executed.