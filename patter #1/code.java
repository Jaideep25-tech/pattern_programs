class pattern_1
{
  public static void main()
  {
    for(int i=1;i<=5;i++)
    {
      for(int j=1;j<=5;j++)
      {
        if(j==3||i==3)
          System.out.print("x ");
        else
          System.out.print("o ");
      }
      System.out.println();
    }
  }
}
