import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(int j=1;j<=k;j++)
      {
        int c=0;
        for(int i=0;i<n;i++)
      	{
        	if(j==a[i])
              c++;
        }
        System.out.println(j+" "+c);
             
      }
    }
}