/*
���α׷� ����ڷκ��� �ϳ��� ���ܾ �Է� �޾Ƽ� �Է� ���� ���ܾ��� ���̸� ����Ͽ�
����ϴ� ���α׷��� �ۼ��غ���. ���� �� "Array"��� �ܾ �ԷµǸ� 5�� ��µǾ�� �Ѵ�.
*/
#include <stdio.h>
int main()
{
	int i;
	int length=0;
	char word[30];
	printf("���ܾ �ϳ� �Է��ϼ���. : ");
	scanf("%s",word);
	for(i=0;word[i]!=0;i++)
		length++;
	printf("�ܾ��� ���� = %d\n",length);
	return 0;
}
