/*
���α׷� ����ڷκ��� ���ܾ �Է� �޾Ƽ� char�� �迭�� �����Ѵ�.
�� ���� �迭�� ����� ���ܾ �������� �����´�.
���� �� ���� �� ������ ��ġ�� �����ؼ��� �� �ȴ�.
������ ������ ����� ������������ Ȯ���ϱ� ���ؼ� ����غ���.
*/
#include <stdio.h>
int main()
{
	int i;
	int length=0;
	char temp;
	char eword[30];
	printf("���ܾ �Է��ϼ���. : ");
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