 //To demonstrate Inheritance and method over Writing
 class Shape{

    public void area(){
        System.out.println("This is a Shape");
      
    }
}
 class Circle extends Shape
{
    public void area(int r){
        super.area();
        System.out.println("Area of circel : "+r*r*3.14);
    }
}
class Rectangle extends Shape
{
    public void area(int a,int b){
        super.area();
        System.out.println("Area of rectangle : "+a*b);
    }
}
public class MethodOverwritingEx2{
    public static void main(String[] args) {
	    Shape a = new Shape();
	    Circle b = new Circle();
	    Rectangle c =new Rectangle();
	    a.area();
	    b.area(4);
	    c.area(5,5);
	 
	}
}