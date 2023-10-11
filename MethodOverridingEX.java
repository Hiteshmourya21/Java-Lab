class parent{
    void display(){
        System.out.println("This is a parent class");
    }
    void show(int n){
        System.out.println("The number in parent class is :"+ n);
    }
}
class child extends parent{
    void display(){
        System.out.println("This is a child class");
    }
    void show(double n){
        System.out.println("The number in child class is :"+ n);
    }
   
}
public class MethodOverridingEX{
    public static void main (String[] args) {
        parent p =new parent();
        child c = new child();
    //overloading
        c.show(5);
        c.show(7.5);
    //overriding
    p.display();
    c.display();
    }
}