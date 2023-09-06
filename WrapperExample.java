//This is a program for auto boxing
public class WrapperExample
{
	public static void main(String[] args) {
	    boolean b= true;
	    Boolean b1 = Boolean.valueOf(b);
	    Boolean b2 = b;
	   
		System.out.println(b+" "+b1+" "+b2);
		
		int i= 20;
	    Integer i1 = Integer.valueOf(i);
	    Integer i2 = i;
	   
		System.out.println(i+" "+i1+" "+i2);
		
		char c= 'H';
	    Character c1 = Character.valueOf(c);
	    Character c2 = c;
	   
		System.out.println(c+" "+c1+" "+c2);
		
		double d = 1234.213d;
		Double d1 = Double.valueOf(d);
	    Double d2 = d;
	   
		System.out.println(d+" "+d1+" "+d2);
		
		float f = 123.13f;
		Float f1 = Float.valueOf(f);
	    Float f2 = f;
	   
		System.out.println(f+" "+f1+" "+f2);
	
		byte by = 23;
		Byte by1 = Byte.valueOf(by);
	    Byte by2 = by;
	   
		System.out.println(by+" "+by1+" "+by2);
	}
}
