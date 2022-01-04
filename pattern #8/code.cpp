#include<iostream>
using namespace std;
int main()
{
  clrscr();
  int j,i,k;
  for(i=1;i<6;i++)
  {
    k=(i%2!=0)?i+1:i;
    for(int g=6;g>k;g--)
    {
      cout<<" ";
    }
    for(j=0;j<k;j++)
    {
      cout<<"*";
    }
    cout<<endl;
  }
  getch();
}
