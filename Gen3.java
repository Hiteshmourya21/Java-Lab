
public class Gen3
{
	public static void main(String[] args) {
	    generic<Integer> c = new generic<>(20);
	    generic<String> c1 = new generic<>("Hitesh");
	    generic<Boolean> c2 = new generic<>(true);
	    System.out.println("Generic class data : "+ c.display());
	    System.out.println("Generic class data : "+ c1.display());
	    System.out.println("Generic class data : "+ c2.display());
	    
	    
	}
}

class generic<T>{
    public T a;
    public generic(T a){
        this.a=a;
    }
    public T display(){
        return a;
    }
}
