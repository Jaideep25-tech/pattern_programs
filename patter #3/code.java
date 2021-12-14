class patter3
{
  public static void main()
  {
    int n=5;
    int m=(n/2)+1;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n;j++)
      {
        if(i==m&&j==m)
          System.out.print("o ");
        else
          System.out.print("x ");
      }
      System.out.ptintln();
    }
  }
}
