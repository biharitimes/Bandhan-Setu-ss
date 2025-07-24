
class Addtion { 
    public int add(int a, int b) {
        return a + b;
    }
}

class Subraction {
    public int subract(int a, int b) {
        return a - b;
    }
}

public class Calculator { 
    public static void main(String[] args) {
        Addtion obj1 = new Addtion();
        System.out.println("Addition :" + obj1.add(11, 12));

        Subraction obj2 = new Subraction();
        System.out.println("Subtraction :" + obj2.subract(20, 5));
    }
}