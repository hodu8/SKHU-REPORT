/*
길이가 5인 int형 배열을 선언해서 프로그램 사용자로부터 총 5개의 정수를 입력받자
그리고 입력이 끝나면 다음의 내용을 출력하도록 예제를 작성해보자
- 입력된 정수 중에서 최댓값
- 입력된 정수 중에서 최솟값
- 입력된 정수의 총 핪
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
		printf("정수 입력 : ");
		scanf("%d",&arr[i]);
		min=arr[0];
		if(arr[i]>max)
			max=arr[i];
		if(min>arr[i])
			min=arr[i];
		sum+=arr[i];
	}
	printf("입력된 배열 = %d %d %d %d %d\n",arr[0],arr[1],arr[2],arr[3],arr[4]);
	printf("입력된 정수 중 최댓값 = %d\n",max);
	printf("입력된 정수 중 최솟값 = %d\n",min);
	printf("입력된 정수의 핪 = %d\n",sum);
	return 0;
}