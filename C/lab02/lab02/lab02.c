#include <stdio.h>
int main()
{
	
	int sum=0;
	int n=0;
	int i=0;
	printf("lab0_2 : 박찬우");
	printf("10개의 정수를 입력하세요.");
	for (i=0;i<10;i++)
	{
		scanf("%d",&n);
		sum+=n;
	}
	printf("%d",sum);
	return 0;
}