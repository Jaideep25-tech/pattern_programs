#include <iostream>
using namespace std;
#include <conio.h>
int main()
{
  int i,j;
  for(int i=1;i<=5;i++)
  {
    for(j=1;;j<=5;j++)
    {
      if(j==3||i==3)
        cout<<"x ";
      else
        cout<<"o ";
    }
    cout<<endl;
  }
  getch();
}
