import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int a[][]=new int[row][col];
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    int count=0,k=0;
    while(count!=row)
    {
      for(int i=0;i<row;i++)
      {
        for(int j=0;j<col;j++)
        {
          if((j-i)==k)
            
            System.out.print(a[i][j]+" ");
        }
      }
      count++;
      k++;
    }
    
  }
}