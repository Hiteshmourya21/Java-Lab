
public class ThreadEx extends Thread
{
	public static void main(String[] args) {
	    ThreadEx thread  = new ThreadEx();
	    thread.start();
		System.out.println("Outside of thread");
	}
	public void run(){
	    System.out.println("Inside os thread");
	}
}
