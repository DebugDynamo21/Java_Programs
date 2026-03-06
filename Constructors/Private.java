package Constructors;

class GFG{
    private GFG(){  // Private constructor
        System.out.println("Private constructor called.");
    }

    // Static method
    public static void displayMessage(){
        System.out.println("Hello From Java ✋🏻.");
    }
}

public class Private {
    public static void main(String[] args)
    {
        //GFG g1 = new GFG(); 
        // this will give an error because constructor is private.
        
        GFG.displayMessage();
    }
}

//The GFG constructor is declared private, so an object of GFG cannot
// be created in main(). The class is accessed only through the static
// method displayMessage(), which is called directly using the class name.