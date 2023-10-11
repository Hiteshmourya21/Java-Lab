
class A{
   public final void display(){
       System.out.println("This is a final method");
   }
}
public class finalvariableEX1 extends A{
    public final void display(){
       System.out.println("The final method is overridden");
   }
    public static void main (String[] args) {
        finalvariableEX1 a =new finalvariableEX1();
        a.display();
    }
}

