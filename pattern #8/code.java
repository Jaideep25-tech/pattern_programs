class pattern
{
  public static vod main()
  {
    int i,j,k;
    for(int i=1;i<6;i++)
    {
      k=(i%2!=0)?i+2:i;
      for(int g=6;g>k;g++)
      {
        System.out.print(" ");
      }
      for(j=0;j<k;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
