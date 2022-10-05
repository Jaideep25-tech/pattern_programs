$include<iostream>
using namespace std;
int main()
{
  int n=6;
  int j,c,i,k;
  for(i=n;i>0;i--)
  {
    k=(i%2!=0)?i+1:i;
    for(j=0;j<k;j++)
    {
      cout<<"*";
    }
    cout<<endl;
  }
  getch()
  }
