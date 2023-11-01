//Implementation of thread using multiple thread using runnable
public class ThreadEx4 implements Runnable
{
	public static void main(String[] args) {
	        
	    ThreadEx4 thread1  = new ThreadEx4();
	    ThreadEx4 thread2  = new ThreadEx4();
	    ThreadEx4 thread3  = new ThreadEx4();
	    
	    Thread t1 =new Thread(thread1);
	    Thread t2 =new Thread(thread2);
	    Thread t3 =new Thread(thread3);
	    
	    t1.start();
	    t2.start();
	    t3.start();
		System.out.println("Outside of thread");
	}
	public void run(){
	    System.out.println("Inside os thread");
	}
}
