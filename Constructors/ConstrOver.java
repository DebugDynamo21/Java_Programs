// Constructor Overloading.

package Constructors;

class GeeksFG{
    GeeksFG(String name){
        System.out.println("Constructor with one argument:" + " String: " + name);
    }

    GeeksFG(String branch, int section){
        System.out.println("Constructor with two arguments: " + "String & Integer: " + branch + "-" + section);
    }

    GeeksFG(int id){
        System.out.println("Contructor with one argument: " + "Integer: " + id);
    }
}

public class ConstrOver {
    public static void main(String[] args){
        GeeksFG g1 = new GeeksFG("Aman");
        GeeksFG g2 = new GeeksFG("CSE", 17);
        GeeksFG g3 = new GeeksFG(4821);
    }
}

// Demonstrates constructor overloading by defining multiple Geeks
// constructors with different parameter lists. Based on the arguments 
// passed while creating objects (geek2, geek3, geek4), the corresponding
// constructor is invoked at compile time.