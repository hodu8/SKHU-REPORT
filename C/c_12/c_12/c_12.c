/*
�� ���� ������ �Է� �޾Ƽ�, �� ���� �ִ�����(GCM)�� ��ȯ�ϴ� �Լ� gcm�� �����Ѵ�
��) �� ���� ���� �Է� : 6 9
�� ���� �ִ����� : 3
*/
#include<stdio.h>
int gcm(int a,int b);
int main()
{
	int g,num1,num2;
	printf("�� ���� ������ �Է��ϼ���. : ");
	scanf("%d %d",&num1,&num2);
	g=gcm(num1,num2);
	printf("�� ���� �ִ����� : %d\n",g);
	return 0;
}
int gcm(int a,int b)
{
	int mod = a%b; // mod�� a(ū ��)�� b(���� ��)�� ���� ���̴�.
	while(mod>0) //a�� b�� �������µ� 0���� ũ�ٸ� �ݺ��� ����
	{
		a=b; //a(ū ��)�� b(���� ��)�� �ȴ�.
		b=mod; //b(���� ��)�� �������� �ȴ�.
		mod=a%b; //�ٽ� a�� b�� ������. �׷��� 0�� �ȵǸ� �ٽ� �ݺ�
	}
	return b;
}