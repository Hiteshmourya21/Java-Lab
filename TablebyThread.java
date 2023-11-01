//Task
import java.util.Scanner;

class TablebyThread extends Thread{
    
    public static void main (String[] args) {
        TablebyThread thread1  = new TablebyThread();
	    TablebyThread thread2  = new TablebyThread();
	    thread1.start();
	    thread2.start();
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Integer for its table");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
	}
    
}

