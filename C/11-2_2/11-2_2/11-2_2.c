/*
프로그램 사용자로부터 영단어를 입력 받아서 char형 배열에 저장한다.
그 다음 배열에 저장된 영단어를 역순으로 뒤집는다.
물론 이 때에 널 문자의 위치를 변경해서는 안 된다.
뒤집고 나서는 제대로 뒤집혀졌는지 확인하기 위해서 출력해보자.
*/
#include <stdio.h>
int main()
{
	int i;
	int length=0;
	char temp;
	char eword[30];
	printf("영단어를 입력하세요. : ");
	scanf("%s",eword);
	for(i=0;eword[i]!=0;i++)
		length++;
	for(i=0;i<length/2;i++)
	{
		temp=eword[i];
		eword[i]=eword[(length-i)-1];
		eword[(length-i)-1]=temp;
	}
	printf("%s\n",eword);
	return 0;
}