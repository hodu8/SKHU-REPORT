/*
���� : �ﰢ���� ���� ���
�а� : ����Ʈ������а�
�й� : 201732015
�̸� : ������
*/
#include <stdio.h>
float cal(float a,float b)
{
	return (a*b)/2;
}
int main()
{
	int x=0;
	int y=0;
	printf("lab0_3 : ������\n\n");
	printf("�غ� �Է�: ");
	scanf("%d",&x);
	printf("���� �Է�: ");
	scanf("%d",&y);
	printf("���� = %.1f\n",cal(x,y));
	return 0;
}