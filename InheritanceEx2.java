 class Animal{
    public int legCount;
    public void display(){
        System.out.println("I am an animal");
        System.out.println("I have "+legCount+" legs" );
    }
}
public class InheritanceEx2
{
	public static void main(String[] args) {
	    Animal animal = new Animal(); 
	    animal.legCount = 4;
	    animal.display();
		//System.out.println("Hello World");
	}
}