package Constructors;

class Geek{
    String name;
    int id;

    Geek(String name, int id){  // Parameterized constructor
        this.name = name;
        this.id = id;
    }

    Geek(Geek obj2){    //Copy constructor
        this.name = obj2.name;
        this.id = obj2.id;
    }
}

public class Copy {
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor
        System.out.println("First Object");
        Geek g1 = new Geek("Atul", 1218);
        System.out.println("GeekName: " + g1.name
                           + " and GeekId: " + g1.id);

        System.out.println();

        // This would invoke the copy constructor
        Geek g2 = new Geek(g1);
        System.out.println(
            "Copy Constructor used Second Object");
        System.out.println("GeekName: " + g2.name
                           + " and GeekId: " + g2.id);
    }
}

//This depicts a copy constructor, where the second Geeks object 
// (g2) is created by passing the first object (g1) to the constructor. 
// The copy constructor copies name and id from g1 to g2, resulting 
// in two objects with the same data.