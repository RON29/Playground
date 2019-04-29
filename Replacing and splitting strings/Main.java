import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      int n=sc.nextInt();
      int f=0;
      int l=0;
      
      for(int i=1;i<n;i++)
      {
         l=s2.indexOf(' ',f);
        System.out.println(s2.substring(f,l));
        f=l+1;
        
        
      }
      System.out.println(s2.substring(f,s2.length()));
                       
    }
}