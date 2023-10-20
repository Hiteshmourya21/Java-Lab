import java.util.Scanner;
public class ThrowEx3
{
  public static void checkAge (int a[]) throws ArrayIndexOutOfBoundsException
  {for(int i=0;i<=a.length;i++){
    System.out.println (a[i]);
  }
  }
  public static void main (String[]args)
  { Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
    int a[]=new int[n] ;
    try
    {
      checkAge (a);
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
      System.out.println ("\n Index Out Of Bounds");
    }
    

  }
}
