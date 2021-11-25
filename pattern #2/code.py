n=5
cen=n//2+1
for x in range(1,n+1):
  if(x==cen||y==cen):
    print("* ",end="")
  else:
    print(" ",end="")
  print()
