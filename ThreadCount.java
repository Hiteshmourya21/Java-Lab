//Task
import java.util.Scanner;

class ThreadCount extends Thread{
    
    ThreadCount(String s){
        super(s);
        System.out.println("New Thread is created "+this);
        start();
    }
      public void run(){
      try{
        for(int i=1;i<=10;i++){
            System.out.println("Currently Executing this thread");
        }
	}
	catch(Exception e){
	    System.out.println("Exception"+e);
	}
	System.out.println("thread is terminated");
      }
    
    public static void main (String[] args) {
        ThreadCount t  = new ThreadCount("T");
	    ThreadCount t1  = new ThreadCount("T1");
	    
    }
  
    
}

