/*
프로그램 사용자로부터 영단어를 입력 받는다.
그리고 나서 입력 받은 영단어를 구성하는 문자 중에서
아스키 코드의 값이 가장 큰 문자를 찾아서 출력하는 프로그램을 작성해보자
*/
#include <stdio.h>
int main()
{
	char word[30];
	int i, len=0, max=0;
	printf("영단어를 입력하세요. : ");
	scanf("%s",word);
	max=word[0];
	for(i=0;word[i]!=0;i++)
	{
		if(word[i]>max)
			max=word[i];
	}
	printf("아스키 코드 값이 제일 큰 문자 = %c\n",max);
	return 0;
}