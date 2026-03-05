// Create a class Named Student with properties name and id and print on console.
package Class;

class Student1{
    int id;
    String name;
    
    public Student1(int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args){
        Student1 s1 = new Student1(10,"Alice");
        System.out.println("Student id: " + s1.id);
        System.out.println("Student name: " + s1.name);
    }
}