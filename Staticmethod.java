//Demonstrate the use of static method

public class Staticmethod {
    static int x;
    Staticmethod(int i){ //setter
        x=i;
    }
    public static void get(){ //Getter
        System.out.println(x);
    }
    public static void main(String[] args) {
        Staticmethod.get();
    }
}
