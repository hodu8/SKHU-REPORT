/*
두 개의 정수를 입력 받아서, 두 수의 최대공약수(GCM)을 반환하는 함수 gcm을 정의한다
예) 두 개의 정수 입력 : 6 9
두 수의 최대공약수 : 3
*/
#include<stdio.h>
int gcm(int a,int b);
int main()
{
	int g,num1,num2;
	printf("두 개의 정수를 입력하세요. : ");
	scanf("%d %d",&num1,&num2);
	g=gcm(num1,num2);
	printf("두 수의 최대공약수 : %d\n",g);
	return 0;
}
int gcm(int a,int b)
{
	int mod = a%b; // mod는 a(큰 값)를 b(작은 값)로 나눈 값이다.
	while(mod>0) //a를 b로 나누었는데 0보다 크다면 반복문 실행
	{
		a=b; //a(큰 값)이 b(작은 값)이 된다.
		b=mod; //b(작은 값)은 나머지로 된다.
		mod=a%b; //다시 a를 b로 나눈다. 그래도 0이 안되면 다시 반복
	}
	return b;
}