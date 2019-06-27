import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int str[]=new int[26];
      s=s.toLowerCase();
      int offset;char let;
      for(int i=0;i<s.length();i++){
        let=s.charAt(i);
        if(let>='a' && let<='z')
        {
          offset=let-'a';
          str[offset]++;
        }
      }
      for(int i=0;i<26;i++)
      {
        if(str[i]==0)
        {
          let=(char)(i+'a');
          System.out.print(let+" ");
        }
      }
    }
}