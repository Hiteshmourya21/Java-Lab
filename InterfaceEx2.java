//calculator
 interface calcutor
{   
public void Add(int a,int b);
public void Sub(int a,int b);
public void Mul(int a,int b);
public void Div(int a,int b);

}

class user implements calcutor{
    
public void Add(int a,int b){
    int add = a+b;
    System.out.println("Add : "+add);
}
public void Sub(int a,int b){
    int sub = a-b;
    System.out.println("Sub : "+sub);
}
public void Mul(int a,int b){
    int mul = a*b;
    System.out.println("Mul : "+mul);
}
public void Div(int a,int b){
    double div = a/b;
    System.out.println("Div : "+div);
}
}

public class InterfaceEx2{
    public static void main(String[] args) {
		user a = new user();
		a.Add(6,5);
		a.Sub(6,5);
		a.Mul(6,5);
		a.Div(6,5);
	
	}
}