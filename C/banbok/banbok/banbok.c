#include <stdio.h>
int main()
{
	int dan=0,num=1;
	printf("����� ���� �Է��ϼ��� : ");
	scanf("%d",&dan);

	while(num<10)

	{
		printf("%3dx%d = %d\n",dan,num,dan*num);
		num++;
	}

	return 0;
}