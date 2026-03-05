package AccessModifiers;

class Vehicle{
    // protected data member
    protected int speed;
}

class Bike extends Vehicle{
    void setSpeed(int s){
        speed = s; //accessible in subclass
    }
    int getSpeed(){
        return speed;
    }
}
public class Protected {
    public static void main(String[] args){
        Bike b = new Bike();
        b.setSpeed(100);
        System.out.println("Access via subclass method: "
                           + b.getSpeed());

        Vehicle v = new Vehicle();
        System.out.println(v.speed);
    }
}
//speed is accessible via subclass methods and other classes in the same package, 
// but direct access from a different package (non-subclass) would fail.