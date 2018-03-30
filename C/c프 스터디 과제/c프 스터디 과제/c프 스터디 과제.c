#include <stdio.h>
int main()
{
	double a=0;
	double b=0;
	printf("밑변 입력 : ");
	scanf("%lf",&a);
	printf("높이 입력 : ");
	scanf("%lf",&b);
	printf("넓이 = %.3f\n",a,b,(a*b)/2);
	return 0;
}