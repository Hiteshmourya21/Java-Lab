
class A{
    final int AGE =32;
}
public class finalvariable extends A{
    public static void main (String[] args) {
        A a =new A();
        a.AGE =45;
        System.out.println("AGE: "+a.AGE);
    }
}

