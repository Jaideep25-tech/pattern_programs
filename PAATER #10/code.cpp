void main()
{
  int n=6;
  int i,j,c,k,x;
  for(int i=n;;i>0;;i--)
  {
    k=(i%2!=0)?i+1:i;
    for(x=k;x<n;x++)
    {
      printf(" ");
    }
    for(j=0;j<k;j++)
    {
      printf("*");
    }
    printf("/n");
  }
  getch();
}
