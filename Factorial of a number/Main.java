#include <stdio.h>
int main() {
  int num,i;
  int fact=1;
  scanf("%d",&num);
  for(i=1;i<=num;++i)
    fact=fact*i;
    printf("%d\n",fact);
	return 0;
}