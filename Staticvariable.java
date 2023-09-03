// /Demonstrate the use of static variable  

public class Staticvariable {
    static int x;
    Staticvariable(int i){ //setter
        x=i;
    }
    public static void get(){ //Getter
        System.out.println(x);
    }
    public static void main(String[] args) {
        Staticvariable obj=new Staticvariable(100);
        Staticvariable.get();
    }
}
