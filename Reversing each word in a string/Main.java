import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
    st+=" ";
    int l=st.length();
    String st1="";
    String s="";
    for(int i=0;i<l;i++)
    {
      char c=st.charAt(i);
      if(c==' ')
      {
        st1+=s+" ";
        s="";
      }
      else
        s=c+s;
    }
    System.out.println(st1);
    
  }
}