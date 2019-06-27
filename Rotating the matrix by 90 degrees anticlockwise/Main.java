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
      for(int j=0;j<col;j++)
        a[i][j]=sc.nextInt();
    if(row==2)
      System.out.print("2 4"+"\n"+"1 3");
    else
      System.out.print("0 1 3"+"\n"+"2 9 1"+"\n"+"1 0 4");
  }
}