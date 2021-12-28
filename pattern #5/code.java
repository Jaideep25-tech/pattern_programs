class pattern
{
  public static void main()
  {
    int n=5;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n;j++)
      {
        if(i==j)
          System.out.print("o ");
        else
          System.out.print("x ");
      }
      System.out.println();
    }
  }
}
