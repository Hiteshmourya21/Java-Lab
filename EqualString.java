public class EqualString
{
	public static void main(String[] args) {
	    //create a string
	   String s1 = "Java Programming";
	   String s2 = "Java Programming";
	   String s3 = "Python";
	   
	   boolean r1 = s1.equals(s2);
	   boolean r2 = s1.equals(s3);
	   
	   System.out.println("String First and Third are equal :" + r1);
	   System.out.println("String First and Third are equal :" + r2);
	    
	}
}