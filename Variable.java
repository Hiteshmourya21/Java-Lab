//Demonstrate using Instance/class  Variable in a Java Program by creating a simple public class

public class Variable {
    int x=5;
    public static void main(String[] args) {
        Variable obj=new Variable();
        System.out.print("The value assigned to instance variable is "+obj.x);
    }
}
