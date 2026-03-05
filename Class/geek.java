// Initialize object using method/function.

package Class;

public class geek {
    static String name;
    static float price;

    static void set(String n, float p){
        name = n;
        price = p;
    }

    static void get(){
        System.out.println("Software name is: " + name);
        System.out.println("Software price is: " + price);
    }

    public static void main(String[] args){
        geek.set("Visual Studio", 0.0f);
        geek.get();
    }
}

//This code initializes class data using the static set() method, which assigns 
// values to the static variables name and price. The get() method is then called 
// from main() to access and display those initialized values.