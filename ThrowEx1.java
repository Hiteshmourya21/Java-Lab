
public class ThrowEx1
{ public static void checkNum(int n){
    if(n<1){
        throw new ArithmeticException("\n Number is negative ,can not be clculate square");
    }
    else{
        System.out.println("Square : "+ (n*n));
    }
}
	public static void main(String[] args) {
		ThrowEx1 o = new ThrowEx1();
		o.checkNum(-3);
	}
}
