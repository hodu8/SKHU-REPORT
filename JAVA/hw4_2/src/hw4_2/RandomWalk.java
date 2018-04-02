/*
작성자 : 박찬우
작성일 : 2018.04.02.
주제 : 딱정벌레가 지나간 이동 경로와 목표를 찾았는가를 알아보는 프로그램
 */

package hw4_2;

public final class RandomWalk {

	public static void main(String[] args) {

		boolean tile[][] = new boolean[5][5]; // boolean형 2차원 배열 tile 선언
		int x=0; // 좌표의 x값을 저장할 변수 x 선언
		int y=0; // 좌표의 y값을 저장할 변수 y 선언
		int xg=(int)(Math.random()*5); // 목표 지점의 x좌표를 저장할 난수 xg(xgoal) 선언
		int yg=(int)(Math.random()*5); // 목표 지점의 y좌표를 저장할 난수 yg(ygoal) 선언
		int steps=0; // 총 시도 횟수를 저장할 변수 steps 선언 및 0으로 초기화

		System.out.println("hw4_2 : 박찬우");
		System.out.println("\n출발 = (0,0)");
		System.out.println("목표 = (" + yg + "," + xg + ")");
		System.out.print("이동 경로 = ");

		for (steps=0; steps<20 ; steps++) {
			int dir=(int)(Math.random()*4); // 이동 방향을 저장할 난수 dir 선언
			if (dir == 0 && x<4)
				x++;
			// 만약 dir이 0이고 x가 4보다 작다면 x에 1을 더함
			else if (dir == 1 && x>0)
				x--;
			// 만약 dir이 1이고 x가 0보다 크다면 x에 1을 뺌
			else if (dir == 2 && y<4 )
				y++;
			// 만약 dir이 2이고 y가 4보다 작다면 y에 1을 더함
			else if (dir == 3 && y>0)
				y--;
			// 만약 dir이 3이고 y가 0보다 크다면 y에 1을 뺌

			tile[y][x]=true; // (y,x) 좌표에 true 값을 저장
			System.out.print("(" + y + "," + x + ")"); // 이동 경로 출력

			if (x == xg && y == yg)
				break;
			// 만약 x,y와 xg,yg가 일치한다면 반복을 멈춘다
		}

		System.out.println("\n------");
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (i == 0 && j == 0)
					System.out.print("S");
				// 만약 i와 j가 0이라면 S(시작 지점)을 표시
				else if (i == yg && j == xg)
					System.out.print("G");
				// 만약 i가 yg이고 j가 xg라면 G(목표 지점)을 표시
				else if (tile[i][j] == true)
					System.out.print("#");
				// 만약 (i,y)좌표가 true값이라면 #을 표시
				else
					System.out.print(".");
				// 딱정벌레가 지나가지 않은 자리라면 .을 표시
			}
			System.out.println(); // 반복문을 한바퀴 돌았을때 줄 바꿈
		}
		System.out.println("------");

		if (x == xg && y == yg) {
			System.out.println("성공");
			System.out.println("총 시도 횟수 = " + (steps+1));
			// 만약 딱정벌레가 목표 지점에 도착했다면 "성공"을 출력하고 총 시도 횟수에 1을 더한 값을 출력
		}
		else
			System.out.println("실패");
		// 만약 딱정벌레가 목표 지점에 도착하지 못했다면 "실패"를 출력
	}
}
