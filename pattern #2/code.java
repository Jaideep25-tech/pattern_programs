class pattern_113
{
  public static void main()
  {
    for(int i=1;i<=5;i++)
    {
      for(init j=1;j<=5;j++)
      {
        if(j==3||i==3)
          System.out.println("* ");
        else
          System.out.println(" ");
      }
      System.out.println();
    }
  }
}
