class pattern9
{
  public static void main()
  {
    int n=6;
    int i,j,c,k;
    for(i=n;i>0;i--)
    {
      k=(i%2!=0)?i+1:i;
      for(j=0;j<k;j++)
      {
        System.oout.print("*");
      }
      System.out.println();
    }
  }
}
