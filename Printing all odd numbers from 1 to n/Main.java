#include <stdio.h>
int main() {
  int n;
  int count;
  scanf("%d",&n);
  for(count=1;count<=n;count+=2)
  {
    printf("%d\n",count);
  }
	return 0;
}