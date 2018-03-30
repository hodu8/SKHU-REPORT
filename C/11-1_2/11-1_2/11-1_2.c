/*
char형 1차원 배열을 선언과 동시에 다음 문장의 내용으로 초기화하고,
초기화 이후에는 저장된 내용을 출력하는 예제를 작성해보자
"Good time"
*/
#include <stdio.h>
int main()
{
	char arr[]={"Good time"};
	printf("%s\n",arr);
	return 0;
}