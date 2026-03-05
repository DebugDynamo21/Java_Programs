package MultipleInheritance;
interface my1{
    void show();
}

interface my2{
    void display();
}

interface my extends my1, my2{
    void xyz();
}

public class multiInheritance implements my {
    public void show(){
        System.out.println("Hello");
    }

    public void display(){
        System.out.println("hi");
    }

    public void xyz(){
        System.out.println("World");
    }
    
    public static void main(String args[]){
        my m = new multiInheritance();
        m.show();
        m.display();
        m.xyz();
    }

}
