#include <stdio.h>
int main()
{
	int n,fac=1,i;

	printf("정수를 하나 입력하세요. : ");
	scanf("%d",&n);

	for (i=1;n>i;n--)
		fac*=n;

	printf("%d\n",fac);
		
	return 0;
}