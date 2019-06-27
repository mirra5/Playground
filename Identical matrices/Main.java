import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //your code here
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int a[][]=new int [r][c];
    int b[][]=new int[r][c];
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
        a[i][j]=sc.nextInt();
    int count=0;
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
        b[i][j]=sc.nextInt();
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        if(a[i][j]==b[i][j])
          count++;
      }
    }
    if(count==(r*c))
      System.out.print("Yes");
    else
      System.out.print("No");
    
  }
}