package AccessModifiers;

class Car{
    //Default access
    String color;
    String model; 
}

public class Default {
    public static void main(String[] args){
        Car c = new Car();
        c.color = "White";
        c.model = "Tesla";
        System.out.println("Car Model: " + c.model + "\nCar color: " + c.color);
    }
}
