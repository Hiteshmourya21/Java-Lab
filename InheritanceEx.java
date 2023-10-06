class Animal{
    protected void display(){
        System.out.println("I am an animal");
    }
}
public class InheritanceEx extends Animal
{
	public static void main(String[] args) {
	    InheritanceEx dog =new InheritanceEx();
	    dog.display();
		//System.out.println("Hello World");
	}
}