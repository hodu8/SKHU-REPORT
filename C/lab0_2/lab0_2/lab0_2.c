/*
학번 : 201732015
학과 : 소프트웨어공학과
이름 : 박찬우
주제 : 사용자로부터 10개의 정수값을 입력받아 그 중 1~100 범위의 값을 모두 더하여 최종 합을 출력한다.
*/
#include <stdio.h>
int main()
{
	int sum=0;
	int n=0;
	int i=0;
	printf("lab0_2 : 박찬우\n\n");
	printf("10개의 정수를 입력하세요.\n");
	for (i=0;i<10;i++)
	{
		scanf("%d",&n);
		if (n>0 && n<101)
		{
			sum+=n;
		}
	}
	printf("1~100 범위 값들의 합 = %d\n",sum);
	return 0;
}