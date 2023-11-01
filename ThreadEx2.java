//Implementation of thread using Runnable class
public class ThreadEx2 implements Runnable
{
	public static void main(String[] args) {
	    ThreadEx2 thread  = new ThreadEx2();
	    Thread t = new Thread(thread);
	    t.start();
		System.out.println("Outside of thread");
	}
	public void run(){
	    System.out.println("Inside os thread");
	}
}
