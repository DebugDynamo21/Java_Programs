// example demonstrates how an interface in Java defines 
// constants and abstract methods, which are implemented 
// by a class.

package OOPs.Abstraction.Interface;

// Interface declared
interface testInterface {

    // public, static and final
    final int a = 10;

    void display(); // public display
}

// Class implementing interface
class TestClass implements testInterface{
    
    // Implementing the capabilities of interface
    public void display(){
        System.out.println("ABES Engineering College");
    }
}

class p1 {
    public static void main(String[] args){
        TestClass t = new TestClass();
        t.display();
        System.out.println(t.a);
    }
}
