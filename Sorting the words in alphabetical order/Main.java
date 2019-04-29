import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //your code here;\
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s1=sc.nextLine();
    String st[]=new String[n];
    for(int i=0;i<n;i++){
      st[i]=sc.nextLine();
      //System.out.println(s);
	}
    //int l=st.length();
    
    for(int j=0;j<=26;j++)
    {
      char c=(char)(j+65);
      char c1=(char)(j+97);
      for(int i=0;i<n;i++)
      {
        if(c==st[i].charAt(0) || c1==st[i].charAt(0))
          System.out.println(st[i].toLowerCase());
      }
      
    }
     
   
		
  }
}