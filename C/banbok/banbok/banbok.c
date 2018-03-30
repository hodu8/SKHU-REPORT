#include <stdio.h>
int main()
{
	int dan=0,num=1;
	printf("출력할 단을 입력하세요 : ");
	scanf("%d",&dan);

	while(num<10)

	{
		printf("%3dx%d = %d\n",dan,num,dan*num);
		num++;
	}

	return 0;
}