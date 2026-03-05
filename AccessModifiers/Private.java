package AccessModifiers;

class Person{
    //private variable
    private String name;

    public void setName(String name){
        this.name = name;   //accessible within the class
    }

    public String getName(){
        return name;
    }
}

public class Private {
    public static void main(String[] args){
        Person p = new Person();
        p.setName("Alice");

        //Sysytem.out.println(p.name) will give error as private method
        System.out.println(p.getName());
    }
}
// Direct access to name is not allowed outside Person, enforcing encapsulation.