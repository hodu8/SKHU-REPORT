/*
 * 파일명: StudentTest.java
 * 작성일: 2018.4.24
 * 작성자: 홍길동
 * 내용: 학생 객체를 생성하고 이용하는 프로그램
 */

package lab6_6;

public class StudentTest {

 public static void main(String[] args) {
  System.out.println("lab6_6: 박찬우\n");
  
  // 두 명의 학생 객체 생성
  Student s1 = new Student("Park", "Tokyo", "Japan");
  Student s2 = new Student("Kim", "Seoul", "Korea");
  
  // 학생 정보 출력
  System.out.println(s1.toString());
  System.out.println(s2.toString());
  
  // s1을 이사 - s2가 사는 도시, 국가로 이사
  s1.move(s2.getCity(), s2.getCountry());

  // 학생 정보 출력
  System.out.println("\n이사 후\n");
  System.out.println(s1.toString());
  System.out.println(s2.toString());
 }
}