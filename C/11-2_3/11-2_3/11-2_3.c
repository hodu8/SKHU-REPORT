/*
���α׷� ����ڷκ��� ���ܾ �Է� �޴´�.
�׸��� ���� �Է� ���� ���ܾ �����ϴ� ���� �߿���
�ƽ�Ű �ڵ��� ���� ���� ū ���ڸ� ã�Ƽ� ����ϴ� ���α׷��� �ۼ��غ���
*/
#include <stdio.h>
int main()
{
	char word[30];
	int i, len=0, max=0;
	printf("���ܾ �Է��ϼ���. : ");
	scanf("%s",word);
	max=word[0];
	for(i=0;word[i]!=0;i++)
	{
		if(word[i]>max)
			max=word[i];
	}
	printf("�ƽ�Ű �ڵ� ���� ���� ū ���� = %c\n",max);
	return 0;
}