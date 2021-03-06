/********************************************************
주제: 해당 연도가 윤년인지 계산하는 프로그램을 작성
작성자 학번: 201732015	
작성자 이름: 박찬우
작성일: 2017년 5월 17일
*********************************************************/
#include <stdio.h> //입출력을 위한 헤더파일 포함
int is_leap(int year); //함수 원형 정의
int main()
{
	int y; //연도를 입력받을 변수 y 선언
	printf("연도를 입력하세요. : ");
	scanf("%d",&y);
	//사용자로부터 연도를 입력받는다.
	if (is_leap(y)==1)
		printf("해당 연도는 윤년입니다.\n해당 연도는 366일 입니다.\n");
	//만약 사용자가 윤년을 입력하면 출력
	else
		printf("해당 연도는 윤년이 아닙니다.\n해당 연도는 365일 입니다.\n");
	//만약 사용자가 윤년이 아닌 연도를 입력하면 출력
	return 0; //함수 끝
}
int is_leap(int year)
{
	if (year%4==0)
	{
		if (year%100==0 && year%400!=0)
			return 0;
		//연도가 100의 배수이고 400의 배수가 아니면 0을 반환
		return 1; //연도가 4의 배수이면 1을 반환	
	}
	else
		return 0; //연도가 4의 배수가 아니면 0을 반환
}