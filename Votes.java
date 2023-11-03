//we will have 4 classes 
class A{
    static int BJP = 0;
    static int congress =0;
    public static void vote(String v){
        if(v=="BJP"){
            BJP++;
        }
        else if(v=="congress"){
            congress++;
    }
    else{
        System.out.println("Invalid");
    }
}
}

class B implements Runnable{
    public void run(){
        A.vote("BJP");
    }
}

class C implements Runnable{
    public void run(){
        
        A.vote("congress");
    }
}
public class Votes
{
	public static void main(String[] args) {
		for(int i=0;i<=1800;i++){
		    Thread t1 = new Thread(new B());
		    t1.start();
		}
		for(int i=0;i<=1234;i++){
		    Thread t2 = new Thread(new C());
		    t2.start();
		}
		System.out.println("BJP : "+A.BJP);
		System.out.println("Congress : "+A.congress);
		
	}
}
