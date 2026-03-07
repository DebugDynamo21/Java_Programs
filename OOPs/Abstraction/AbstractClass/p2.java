// Abstract class with only abstract method.

package OOPs.Abstraction.AbstractClass;

abstract class Sunstar{
    abstract void printInfo();
}

//Abstract performed using extends
class Employee extends Sunstar{
    void printInfo(){
        String name = "Alice";
        int age = 24;
        int salary = 24500;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

//Base Class
class p2 {
    public static void main(String[] args){
        Sunstar s = new Employee();
        s.printInfo();
    }
}
