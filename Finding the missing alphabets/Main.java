import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc=new Scanner(System.in);
      String st=sc.nextLine();
      String s=st.toLowerCase();
      for(char c='a';c<='z';c++)
      {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
          if(c==s.charAt(i))
          {
            count++;
            break;
          }
          
        }
        if(count==0)
          System.out.print(c+" ");
      }
    }
}