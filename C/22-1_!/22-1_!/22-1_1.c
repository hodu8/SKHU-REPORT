/*
���ڿ� ������ '������ �̸�'�� ���ڿ� ������ '�ֹε�Ϲ�ȣ'
�׸��� ���� ������ '�޿�����'�� ������ �� �ִ� employee��� �̸��� ����ü�� �����غ���.
�׸��� ���� employee ����ü ������ �ϳ� ������ ����,
���α׷� ����ڰ� �Է��ϴ� ������ �� ������ ä����.
�׸��� ���������� ����ü ������ ä���� �����͸� ����غ���.
*/
#include <stdio.h>
int main()
{
	struct employee
	{
		char name[30];
		char num[20];
		int money;
	} info;
	printf("������ �̸��� �Է��ϼ���. : ");
	scanf("%s",info.name);
	printf("�ֹε�Ϲ�ȣ�� �Է��ϼ���. : ");
	scanf("%s",info.num);
	printf("�޿������� �Է��ϼ���. : ");
	scanf("%d",&info.money);
	printf("������ �̸� : %s\n�ֹε�Ϲ�ȣ : %s\n�޿����� : %d\n",info.name,info.num,info.money);
	return 0;
}