/*
3) 계좌에 돈을 입출금 할 수 있고 잔액을 확인 할 수 있는 프로그램
201732015 박찬우
*/

#include <stdio.h> //입출력을 위한 헤더파일 포함
int main()
{
	int sel=0,money,sum=0; //선택지를 입력받을 변수 sel 선언 및 초기화, 금액을 입력받을 변수 money 선언, 계산을 저장 할 변수 sum 선언

	for (;sel!=4;) //반복문 시작, 조건 정의
	{
		printf("1)입금 2)출금 3)잔액확인 4)취소\n");
		scanf("%d",&sel);
		//사용자로부터 선택지를 입력받음

		if (sel==1)
		{
			printf("입금 할 금액을 입력하세요. : ");
			scanf("%d",&money);
			sum+=money;

			printf("%d원 입금되었습니다.\n\n",money);
		}
		//만약 sel이 1이면 입금 할 금액을 입력받아 sum에 더한 뒤 저장
	
		if (sel==2)
		{
			printf("출금 할 금액을 입력하세요. : ");
			scanf("%d",&money);

			if (money>sum)
			{
				printf("잔액이 부족합니다.\n\n");
				printf("출금 할 금액을 입력하세요. : ");
				scanf("%d",&money);
			}
			//만약 입력받은 금액이 잔액보다 크다면 '잔액이 부족합니다.'를 출력, 선택지로 되돌아감

			else
			{
			printf("%d원 출금되었습니다.\n\n",money);
			sum-=money;
			}
		}
		//만약 sel이 2이면 출금 할 금액을 입력받아 sum에 뺀 뒤 저장

		if (sel==3)
		{
			printf("현재 잔액 = %d원\n\n",sum);
		}
		//만약 sel이 3이면 sum에 저장된 현재 잔액을 출력 

		if (sel==4)
		{
			printf("이용해 주셔서 감사합니다.\n");
		}
		//만약 sel이 4이면 프로그램을 종료
	}

		return 0; //함수 끝
}