#include <stdio.h>
int main()
{
	int start=0,end=0,n=0,sum=0;
	double avg=0;
		
		printf("���� ������ �Է��ϼ���. : ");
		scanf("%d",&start);

		printf("���� ������ �Է��ϼ���. : ");
		scanf("%d",&end);

		avg=(double)(start+end)/2;

		for (;start<=end;start++)
		{
			n++;
			sum+=start;
		}
		
		printf("���� ���� : %d\n�������� : %d\n ���� : %d\n�� : %d\n��� : %.3f\n",start,end,n,sum,avg);

		return 0;
}