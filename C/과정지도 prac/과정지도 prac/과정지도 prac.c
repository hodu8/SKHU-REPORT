#include <stdio.h>
int main()
{
	int n,fac=1,i;

	printf("������ �ϳ� �Է��ϼ���. : ");
	scanf("%d",&n);

	for (i=1;n>i;n--)
		fac*=n;

	printf("%d\n",fac);
		
	return 0;
}