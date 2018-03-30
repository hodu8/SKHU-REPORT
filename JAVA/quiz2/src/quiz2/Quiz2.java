/*
작성자 : 박찬우
작성일 : 2018.03.20.
주제 : 삼항연산자를 사용하여 놀이기구의 이용가능여부 판별
 */
package quiz2;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("quiz2 : 박찬우\n");

		System.out.println("이름 입력 : ");
		String name = input.nextLine();
		System.out.println("나이 입력 : ");
		int age = input.nextInt();
		System.out.println("키 입력 : ");
		double height = input.nextDouble();
		String	result = (age>=13&&height>=130) ? (name + "고객님,\n나이" + age + "세, 키" + height + "이므로\n이용 가능합니다.") : ("조건이 맞지않아 이용 불가능합니다.");
		System.out.println(result);
	}

}
