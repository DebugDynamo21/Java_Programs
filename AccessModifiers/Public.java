package AccessModifiers;

class MathUtils { 
    
    public static int add(int a, int b) {
        return a + b;
    }
}

public class Public {
        public static void main(String[] args) {
        
        System.out.println(MathUtils.add(5, 10)); // accessible anywhere
    }
}

// add() is globally accessible due to the public modifier.