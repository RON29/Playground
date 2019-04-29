import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int m[]=new int[n+1];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
        m[a[i]]=1;
      }
      for(int i=1;i<=n;i++)
      {
        if(m[i]==0)
          System.out.println(i);
      }
      
    }
}