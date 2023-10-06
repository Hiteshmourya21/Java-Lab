 //To demonstrate Inheritance and method over Writing
 class Animal{

    public void init(){
        System.out.println("I am an animal");
      
    }
}
 class Dog extends Animal
{
    public void init(){
        System.out.println("I am an Dog");
    }
    public void bark(){
        System.out.println("Bark");
    }
	
}
public class MethodOverwriting{
    public static void main(String[] args) {
	    Animal animal = new Animal();
	    Dog dog = new Dog();
	    animal.init();
	    dog.init();
	    dog.bark();
	 
	}
}