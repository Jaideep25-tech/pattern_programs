#include<iostream>
using namespace std;
int main()
{
  int i,j,k;
  for(i=1;i<=6;i++)
  {
    k=(i%2!=0)?i+1;i;
    for(j=0;j<k;j++)
    {
      cout<<"*";
    }
    cout<<"/n";
  }
  getch();
}
