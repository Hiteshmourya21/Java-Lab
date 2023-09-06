//Demonstration of ToString method
public class OverwritingToSTring
{
      int rollno;
      String name;
      String city;
      
    OverwritingToSTring(int rollno , String name , String city){ 
        this.rollno = rollno;
        this.name  = name;
        this.city = city;
    }
    public String toString(){
        return rollno+name+city;
    }
	public static void main(String[] args) {
	    OverwritingToSTring s1 = new OverwritingToSTring(64 , " Hitesh" , " indore");
	    OverwritingToSTring s2 = new OverwritingToSTring(65 , " Ayush" , " indore");
	   
		System.out.println(s1);
		System.out.println(s2);
	

	}
}
