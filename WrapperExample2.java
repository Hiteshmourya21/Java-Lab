//This is a program for auto boxing
public class WrapperExample2
{
	public static void main(String[] args) {
	    Boolean b= new Boolean(true);
	    boolean b1= true;
	    boolean b2 = b;
	   
		System.out.println(b+" "+b1+" "+b2);
		
		Integer i = new Integer(3);
		int i1= i.valueOf(i);
	    int i2 = i;
	   
		System.out.println(i+" "+i1+" "+i2);
		
		Character c = new Character('C');
		char c1= c.valueOf(c);
	    char c2 = c;
	   
		System.out.println(c+" "+c1+" "+c2);
		
		Double d = new Double(1234.2341d);
		double d1 = d.valueOf(d);
	    double d2 = d;
	   
		System.out.println(d+" "+d1+" "+d2);
		
		Float f = new Float(123.4f);
		float f1 = f.valueOf(f);
	    float f2 = f;
	   
		System.out.println(f+" "+f1+" "+f2);
	
// 		Byte by = new Byte(2);
// 		byte by1 = by.valueOf(by);
// 	    byte by2 = by;
// 		System.out.println(by+" "+by1+" "+by2);
	}
}
