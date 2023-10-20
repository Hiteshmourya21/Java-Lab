
public class ThrowEx2
{   
    public static void checkNum(String n){
    if(n==null){
        throw new NullPointerException("\n null was given");
    }
    
}
	public static void main(String[] args) {
		ThrowEx1 o = new ThrowEx1();
		o.checkNum(null);
	}
}
