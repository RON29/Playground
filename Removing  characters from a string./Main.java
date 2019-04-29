import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
    int l=st.length();
    String w=sc.nextLine();
    int l1=w.length();
    for(int i=0;i<l;i++)
    {
      char c=st.charAt(i);
      int co=0;
      for(int j=0;j<l1;j++)
      {
        char d=w.charAt(j);
        if(c==d)
          co++;
        
      }
      if(co==0)
        System.out.print(c);
      
    }
  }
}