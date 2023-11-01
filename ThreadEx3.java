//Implementation of thread using multiple thread
public class ThreadEx3 extends Thread
{
	public static void main(String[] args) {
	    ThreadEx3 thread1  = new ThreadEx3();
	    ThreadEx3 thread2  = new ThreadEx3();
	    ThreadEx3 thread3  = new ThreadEx3();
	    
	    thread1.start();
	    thread2.start();
	    thread3.start();
		System.out.println("Outside of thread");
	}
	public void run(){
	    System.out.println("Inside os thread");
	}
}
