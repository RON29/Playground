import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      int a1=sc.nextInt();
      int a2=sc.nextInt();
      int c1=-1,c2=-1;
      for(int i=0;i<n;i++)
      {
        if(a1==arr[i])
          c1=i;
        if(a2==arr[i])
          c2=i;
        
      }
      System.out.println(c1);
      System.out.println(c2);
      
    }
}