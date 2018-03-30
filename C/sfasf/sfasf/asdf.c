#include <stdio.h>
int main()
{
	int dan,i;
	for(dan=1;dan<10;dan++)
	{
		if(dan%2!=0)
				continue;

		for(i=1;i<10;i++)
		{
			if (dan<i)
				break;
				printf("%d x %d = %d\n",dan,i,dan*i);
		}
		printf("\n");
	}
return 0;
}