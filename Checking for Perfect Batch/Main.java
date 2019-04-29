import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int [n];
    int sum=0;
    int sum1=0;
    int f=0;
    
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      sum1+=a[i];
      if((i+1)%3==0)
      {
        if(i!=2)
        {
          if(sum!=sum1)
          {
            System.out.println("Not a Perfect Batch");
            f=1;
            break;
          }
          else
          {
            sum=sum1;
            sum1=0;
          }
        }
        else
        {
          sum=sum1;
          sum1=0;          
        }
        
      }
      
        
    }
    if(f==0)
      System.out.println("Perfect Batch");
   

  }
}