import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int k=sc.nextInt();
      int temp;
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(a[i]>a[j])
          {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
          }
         } 
      }
      System.out.print(a[k-1]);
      
    
    }
    }
