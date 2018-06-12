/*
 * 주제 : 카드 게임
 * 작성자 : 박찬우
 * 작성일 : 2018.06.12.
 */

package hw15_1;

import java.util.ArrayList;
import java.util.Collections;

// 소스를 입력하고 Ctrl+Shift+O를 눌러서 필요한 파일을 포함한다.

class Card {
	private int number; // 카드 번호

	public Card(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public String toString() {
		return Integer.toString(number);
	}
}

//카드 50장을 다루는 덱을 표현하는 클래스 Deck
class Deck {
	public static final int MAX_NUMBER = 50;
	private ArrayList<Card> deck = new ArrayList<Card>();

	// 카드를 생성하여 덱에 넣음
	public Deck() {
		for (int i = 0; i < MAX_NUMBER; i++)
			deck.add(new Card(i));
	}

	// 카드를 섞음
	public void shuffle() {
		Collections.shuffle(deck);
	}

	// 덱의 맨 앞 카드를 제거하여 리턴
	public Card deal() {
		return deck.remove(0);
	}
}

//자신의 카드 리스트를 지닌 플레이어 클래스 Player
class Player {
	private ArrayList<Card> list = new ArrayList<Card>();

	public void getCard(Card card) {
		list.add(card);
	}

	public void showCards() {
		System.out.println(list);
	}

	// 자신이 지닌 카드 중 최대 카드를 리스트에서 삭제하고 리턴하는 메소드를 작성하시오.
	public int removeMaxCard() {
		int max = 0; // 최댓값을 저장할 정수형 변수 max 선언
		int temp = 0; // 최댓값의 인덱스 값을 저장할 변수 temp 선언
		for (int i = 0; i < list.size(); i++) {
			if (Integer.parseInt(list.get(i).toString()) > max) { // 만약 list의 i번째 요소가 max보다 크다면
				max = Integer.parseInt(list.get(i).toString()); // max를 list의 i번재 요소 값으로 변경
				temp = i; // temp 값을 i로 변경
			}
		} list.remove(temp); // list의 temp번째 요소 값을 삭제
		return max; // 최댓값을 반환
	}
}

public class CardGame {
	public static void main(String[] args) {
		System.out.println("hw15_1 : 박찬우\n");
		Deck deck = new Deck(); // 덱 객체를 하나 만듬
		deck.shuffle(); // 덱의 카드를 섞음
		Player p1 = new Player();
		Player p2 = new Player();
		// 플레이어1, 플레이어2를 생성(p1, p2이라고 부름)
		p1.getCard(deck.deal());
		p1.getCard(deck.deal());
		p1.getCard(deck.deal());
		p1.getCard(deck.deal());
		p1.getCard(deck.deal());
		p2.getCard(deck.deal());
		p2.getCard(deck.deal());
		p2.getCard(deck.deal());
		p2.getCard(deck.deal());
		p2.getCard(deck.deal());
		// p1과 p2에게 번갈아가며 5장씩 카드를 나누어 줌
		System.out.println("p1과 p2의 카드 목록");
		p1.showCards();
		p2.showCards();
		// p1, p2의 카드 목록을 출력
		System.out.println("\np1과 p2의 최대 카드");
		int result1 = p1.removeMaxCard();
		int result2 = p2.removeMaxCard();
		// p1, p2의 최대 카드를 알아내되 최대 카드를 버림
		// result1과 result2에 각각 결과 값을 저장
		System.out.println(result1);
		System.out.println(result2);
		System.out.println();
		System.out.print((result1>result2)?"p1":"p2");
		System.out.println(" 승리!\n");
		// 게임 룰에 따라 승자가 누구인지 출력
		System.out.println("p1과 p2의 카드 목록");
		p1.showCards();
		p2.showCards();
		// p1, p2의 카드 목록을 출력
	}
}