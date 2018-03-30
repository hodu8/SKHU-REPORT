/*
프로그램 사용자로부터 하나의 영단어를 입력 받아서 입력 받은 영단어의 길이를 계산하여
출력하는 프로그램을 작성해보자. 예를 들어서 "Array"라는 단어가 입력되면 5가 출력되어야 한다.
*/
#include <stdio.h>
int main()
{
	int i;
	int length=0;
	char word[30];
	printf("영단어를 하나 입력하세요. : ");
	scanf("%s",word);
	for(i=0;word[i]!=0;i++)
		length++;
	printf("단어의 길이 = %d\n",length);
	return 0;
}
