/*
���̰� 5�� int�� �迭�� �����ؼ� ���α׷� ����ڷκ��� �� 5���� ������ �Է¹���
�׸��� �Է��� ������ ������ ������ ����ϵ��� ������ �ۼ��غ���
- �Էµ� ���� �߿��� �ִ�
- �Էµ� ���� �߿��� �ּڰ�
- �Էµ� ������ �� �D
*/
#include <stdio.h>
int main()
{
	int i;
	int arr[5]={0, };
	int max=0;
	int min;
	int sum=0;
	for(i=0;i<5;i++)
	{
		printf("���� �Է� : ");
		scanf("%d",&arr[i]);
		min=arr[0];
		if(arr[i]>max)
			max=arr[i];
		if(min>arr[i])
			min=arr[i];
		sum+=arr[i];
	}
	printf("�Էµ� �迭 = %d %d %d %d %d\n",arr[0],arr[1],arr[2],arr[3],arr[4]);
	printf("�Էµ� ���� �� �ִ� = %d\n",max);
	printf("�Էµ� ���� �� �ּڰ� = %d\n",min);
	printf("�Էµ� ������ �D = %d\n",sum);
	return 0;
}