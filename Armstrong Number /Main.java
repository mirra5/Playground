import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int org=n;
      int count=0,temp=n,sum=0,prod;
      while(n>0)
      {
        n/=10;
        count++;
      }
      while(temp>0)
      {
        n=temp%10;
        prod=1;
        for(int i=0;i<count;i++)
        {
          
          prod=prod*n;
        }
        sum+=prod;
        temp=temp/10;
      }
      if(org==sum)
      System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
          
          
        
        
	}
}