import java.util.Scanner;
class Main{
  public static void prime(int num)
  {
    int flag;
    for(int i=2;i<=num;i++)
    {
      flag=1;
      for(int j=2;j<=i/2;j++)
      {
        if(i%j==0)
          flag=0;
      }
      if(flag==1)
        System.out.println(i);
    }}
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      prime(num);
        
	}
}