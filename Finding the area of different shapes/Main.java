import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n==3)
      {
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a*b/2);
      }
      if(n==4)
      {
        double a=sc.nextDouble();
        System.out.println(3.14*a*a);
      }
    }
}