// Abstract Class with constructor and methods.

package OOPs.Abstraction.AbstractClass;

abstract class Subject{
    Subject(){
        System.out.println("Subject: Learing OOPs with Java");
    }

    abstract void syllabus();

    void Learn(){
        System.out.println("Learn: Java Programming! ");
    }
}

class AKTU extends Subject{
    void syllabus(){
        System.out.println("Syllabus: " + "OOPs with Java, Exception handling, Packages");
    }
}

class p3 {
    public static void main(String[] args){
        Subject x = new AKTU();
        x.syllabus();
        x.Learn();
    }
}
