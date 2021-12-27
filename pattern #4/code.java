class pattern{
  public static void main()
  {
    int n=5;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n;j++)
      {
        if(i==j||i+j==n+1)
        {
          System.out.print("x ");
        }
        else
        {
          System.out.print("o ");
        }
      }
      System.out.println();
    }
  }
}
