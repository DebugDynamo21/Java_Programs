// Abstract class with partial abstraction.
package OOPs.Abstraction.AbstractClass;

abstract class Shape{
    String color;

    Shape(String color){
        this.color = color;
    }

    abstract double area();

    void getColor(){
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape{
    int radius;

    Circle(String color, int radius){
        super(color);
        this.radius = radius;
    }

    double area(){
        return 3.14 * radius * radius;
    }
}

public class p1{
    public static void main(String[] args){
        Shape s = new Circle("Blue", 4);
        s.getColor();
        System.out.println("Area: " + s.area());
    }
}