/*
���̰� 6�� int�� �迭 arr�� �����ϰ� �̸� 1, 2, 3, 4, 5, 6���� �ʱ�ȭ�� ����,
�迭�� ����� ���� ������ 6, 5, 4, 3, 2, 1�� �ǵ��� �����ϴ� ������ �ۼ��غ���.
��, �迭�� �հ� �ڸ� ����Ű�� ������ ���� �� ���� �����ؼ�
�̸� Ȱ���Ͽ� ����� ���Ǽ����� �ڹٲ�� �Ѵ�.
*/
#include <stdio.h>
int main()
{
	int i;
	int arr[6]={1,2,3,4,5,6};
	int *ptrp=&arr[0];
	int *ptrb=&arr[5];
	int temp;
	for(i=0;i<3;i++)
	{
		temp=*ptrp;
		*ptrp=*ptrb;
		*ptrb=temp;
		ptrp++;
		ptrb--;
	}
	printf("%d %d %d %d %d %d\n",arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);
	return 0;
}