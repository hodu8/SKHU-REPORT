#include <stdio.h>
int main()
{
	double a=0;
	double b=0;
	printf("�غ� �Է� : ");
	scanf("%lf",&a);
	printf("���� �Է� : ");
	scanf("%lf",&b);
	printf("���� = %.3f\n",a,b,(a*b)/2);
	return 0;
}