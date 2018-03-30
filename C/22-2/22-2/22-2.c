/*
앞서 문제 22-1에서 정의한 employee 구조체를 기반으로 길이가 3인 배열을 선언하자.
그리고 세 명의 정보를 프로그램 사용자로부터 입력 받아서 배열에 저장한 다음
배열에 저장된 데이터를 순서대로 출력하는 예제를 작성해보자.
*/
#include <stdio.h>
struct employee
{
	char name[30];
	char num[20];
	int money;
};
int main()
{
	int i;
	struct employee arr[3]={
		{"박찬우","1234567-1234567",1000},
		{"이영수","2345678-2345678",900},
		{"김문수","3456789-3456789",800}
	};
	for(i=0;i<3;i++)
		printf("종업원 이름 : %s\n주민등록번호 : %s\n급여 : %d\n",arr[i].name,arr[i].num,arr[i].money);
	return 0;
}