import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int sum[]=new int[n];
      int j=0;
      
      for(int i=0;i<n;i++)
      {
        if(a[i]==1)
          sum[j]++;
        else 
        {
          j++;
          sum[j]++;
        }
      }
      int large=0;
      for(int i=0;i<j+1;i++)
      {
        if(large<sum[i])
          large=sum[i];
      }
      System.out.print(large);
    }
}