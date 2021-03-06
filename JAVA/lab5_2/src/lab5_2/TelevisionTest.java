/*
 * 작성자 : 박찬우
 * 작성일 : 2018.04.10.
 * 주제 : 텔레비전을 나타내는 Television 클래스를 정의하고, Television 배열을 이용하는 프로그램
 */
package lab5_2;

public class TelevisionTest {

	public static void main(String[] args) {
		Television [] tv = new Television[3]; // 크기가 3인 텔레비전 배열을 생성
		for (int i=0; i<3; i++) {
			tv[i] = new Television();
		} // 반복문을 이용하여 텔레비전 배열에 3개의 텔레비전을 생성하여 지정
		tv[0].channel = 7;
		tv[1].channel = 7;
		tv[2].channel = 11;
		// 텔레비전 채널을 각각 7, 7, 11로 지정
		for (int j=0; j<3; j++) {
			System.out.println(tv[j].channel);
		} // 반복문을 이용하여 배열에 저장된 모든 텔레비전의 채널을 출력
	}
}
