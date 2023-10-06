
class Data{
    private  String n;
     public void set(String name){
        n=name;
    }
    public void get(){
        System.out.println(n);
}
}
public class AccessSpeciferEx
{
	public static void main(String[] args) {
	    Data o =new Data();
	    o.set("Hitesh Mourya");
	    o.get();
		//System.out.println("Hello World");
	}
}
