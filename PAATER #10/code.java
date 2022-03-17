class pattern 
{
  public static voiod main()
  {
    int n=6,k;
    for(int i=n;i>0;i--)
    {
      k=(i%2!=0)?i+1:i;
      for(int x=k;x<n;x++)
      {
        System.out.print(" ");
      }
      for(int j=0;j<k;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
