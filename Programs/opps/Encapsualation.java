class Calculator1 {
    private int value;

    public void setValue(int values){
        value = values;
    }

    public int getValue(){
        return value;
    }
}

public class Encapsualation{
    public static void main(String[] args) {
        Calculator1 c = new Calculator1();
       c.setValue(100);
        System.out.println("Get Value :"+ c.getValue());
    }
}