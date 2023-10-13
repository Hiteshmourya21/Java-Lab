
 interface solution
{   public void Hello();
public void Welcome();
public void Name(String n);

}

class A implements solution{
    
    public void Hello(){
        System.out.println("Hello world");
    }
    public void Welcome(){
        System.out.println("Welcome to India");
    }
    public void Name(String n){
        System.out.println("I am "+ n);
    }
}

public class InterfaceEx1{
    public static void main(String[] args) {
		A a = new A();
		a.Hello();
		a.Welcome();
		a.Name("Hitesh");
	
	}
}