/*
작성자 : 박찬우
작성일 : 2018.03.20.
주제 : 랜덤하게 주어지는 두 수의 곱의 결과를 사용자로부터 입력받아 정답수, 오답수, 총점, 합격 여부를 출력
 */

package hw3_1;

import java.util.Scanner;
import java.util.Random;

public class MultiplyTest {

	public static void main(String[] args) {

		Random generator = new Random(); // 난수 생성을 위한 랜덤 메소드 정의
		Scanner input = new Scanner(System.in); // 입력을 위한  Scanner 메소드 정의
		int score = 0; // 총점을 저장하기 위한 변수 score 선언
		int correct = 0; // 맞은 갯수를 저장하기 위한 변수 correct 선언
		int incorrect = 0; // 틀린 갯수를 저장하기 위한 변수 incorrect 선언
		String result2 = ""; // 합격, 불합격 여부를 저장하기 위한 변수 result2 선언
		System.out.println("hw3_1 : 박찬우\n"); // 과제코드 및 작성자명 출력

		System.out.println("곱셈 문제의 답을 입력하세요 (통과하려면 0을 입력).\n"); // 안내문 출력

		for (int i = 0; i<5; i++) {
			// 반복문 시작, 5번 반복

			int num1 = generator.nextInt(9)+1; // num1에 1~9사이의 난수를 저장
			int num2 = generator.nextInt(9)+1; // num2에 1~9사이의 난수를 저장

			System.out.println(num1 + "*" + num2 + "= ? "); // 난수와 난수의 곱셉을 출력
			int result = input.nextInt(); // result에 사용자가 입력한 정수의 값을 저장

			if ( result == 0 ) {
				System.out.println("통과\n");
				continue;
				// 만약 result가 0이면 "통과"를 출력하고 반복문을 다시 실행
			}

			if ( num1 * num2 == result) {
				System.out.println("정답입니다.\n");
				correct += 1;
				score += 20;
				// 만약 result가 정답이라면 "정답입니다."를 출력하고 correct를 1 상승시키고, score에 20을 더함
			} else {
				System.out.println("틀렸습니다.\n");
				if ( score-10 >= 0 ){
					score -= 10;
				}
				incorrect += 1;
				// 아니라면 "틀렸습니다."를 출력하고 score가 음수가 되지 않는다면 score에서 10을 빼고, incorrect를 1 상승
			}
		}

		if ( score >= 50 ) {
			result2 = "합격";
			// 만약 score가 50 이상이라면 result2에 합격을 저장
		} else
			result2 = "불합격";
			// 아니라면 result2에 불합격을 저장
		System.out.println("정답수 " + correct + " 오답수 " + incorrect + " 총점 " + score + " --> " + result2);
		// 정답수, 오답수, 총점, 합격, 불합격 결과를 출력
	}
}