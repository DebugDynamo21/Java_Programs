package OOPs.Polymorphism;

class Person {  // Base class person
    void role(){    // Method that display the role of a person
        System.out.println("I am a Person.");
    }
}

class Father extends Person{    // Derived class father overrides role method
    void role(){    // Overridden method to show the role of Father
        System.out.println("I am a Father.");
    }
}

class p1{
    public static void main(String[] args){
        Person p = new Father();
        p.role();
    }
}

// Explanation: In the above example, the Person class has a method role() that 
// prints a general message. The Father class overrides role() to print a specific 
// message. The reference of type Person is used to point to an object of type 
// Father, demonstrating polymorphism at runtime. The overridden method in Father 
// is invoked when role() is called.