#include <stdio.h>
int main()
{
	int dan=1,i=1;
	for(;dan<10;dan++)
	{
		if(dan%2!=0)
				continue;

		for(;i<10;i++)
		{
			if (dan<i)
				break;
				printf("%d x %d = %d\n",dan,i,dan*i);
		}
		printf("\n");
	}
return 0;
}