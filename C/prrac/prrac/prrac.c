#include<stdio.h>
void main()
{
	int a;
	int b;
	int i=1;
	scanf("%d",&a);
	scanf("%d",&b);
	while(1)
	{
		if(i%a==0&&i%b==0)
			break;
		i++;
	}
	printf("%d",i);
}