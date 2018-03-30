#include <stdio.h>
int main()
{
	int start=0,end=0,n=0,sum=0;
	double avg=0;
		
		printf("시작 정수를 입력하세요. : ");
		scanf("%d",&start);

		printf("종료 정수를 입력하세요. : ");
		scanf("%d",&end);

		avg=(double)(start+end)/2;

		for (;start<=end;start++)
		{
			n++;
			sum+=start;
		}
		
		printf("시작 정수 : %d\n종료정수 : %d\n 개수 : %d\n합 : %d\n평균 : %.3f\n",start,end,n,sum,avg);

		return 0;
}