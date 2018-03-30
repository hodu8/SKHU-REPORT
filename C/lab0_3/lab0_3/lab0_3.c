/*
주제 : 삼각형의 면적 출력
학과 : 소프트웨어공학과
학번 : 201732015
이름 : 박찬우
*/
#include <stdio.h>
float cal(float a,float b)
{
	return (a*b)/2;
}
int main()
{
	int x=0;
	int y=0;
	printf("lab0_3 : 박찬우\n\n");
	printf("밑변 입력: ");
	scanf("%d",&x);
	printf("높이 입력: ");
	scanf("%d",&y);
	printf("면적 = %.1f\n",cal(x,y));
	return 0;
}