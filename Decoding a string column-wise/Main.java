import java.util.Scanner;
class Main{
  public static void main(String args[]) 
  {
    // Type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int n=sc.nextInt();
    String s1="";
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)!=' ')
      	s1=s1+s.charAt(i);
    }
    int x=s1.length()%n;
    x=n-x;
    for(int i=0;i<x;i++)
      s1+='X';
    int size=s1.length();
    //System.out.print(n);
    int n1=size/n;
    char st2[][]=new char[n1][n];
    int co=0;
    int k=1;
    for(int i=0;i<n1;i++)
    {
      if(k%2==1)
      {  
        for(int j=0;j<n;j++)
       		 st2[i][j]=s1.charAt(co++);
      }
      else
      {
        for(int j=n-1;j>=0;j--)
       		 st2[i][j]=s1.charAt(co++);
      }
      k++;
    }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n1;j++)
        System.out.print(st2[j][i]);
    }
    
      
  }
}