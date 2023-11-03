java.util.Scanner;
class A{
    static String acc ="0827CI221064";
    static int am = 0;
    public static void withdraw(String s ,int n){
        if(acc!=s){
            System.out.println("Account do not match");
        }
        else{
        if(am==0){
            System.out.println("Account Empty");
        }
        else{
            System.out.println("withdrawed Ammount : "+n);
            am-=n;
            System.out.println("Amount "+am);
        }
    }
    }
    public static void deposite(String s ,int n){
        if(acc!=s){
            System.out.println("Account do not match");
        }
        else{
            System.out.println("Deposited Ammount : "+n);
            am+=n;
            System.out.println("Amount "+am);
        }
    }
}

class B extends Thread{
    public void run(){
        System.out.println("Withdrawing :");
        A.withdraw("0827CI221064",2000);
        
    }
}

class C extends Thread{
    public void run(){
        System.out.println("Depositing :");
         A.deposite("0827CI221064",5000);
    }
}
public class BankSystem
{
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		b.start();
		c.start();
	}
}
