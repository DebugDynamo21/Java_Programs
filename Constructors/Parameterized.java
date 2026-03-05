package Constructors;
class Geeks{
    String name;
    int age;

    Geeks(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("GeekName: " + name + " GeekAge: " + age);
    }

    public static void main(String[] args){
        Geeks g1 = new Geeks("Atul", 17);
        g1.display();
    }
}
//If we want to initialize fields of the class with our own values,
// then use a parameterized constructor.