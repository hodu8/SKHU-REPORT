"""
주제 : 조건문 연습
작성일 : 2017.9.20.
작성자 : 박찬우
"""
"""
사용자로부터 점수를 입력받는다.
90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C,
60점 이상이면 D, 60점 미만이면 F를 학점으로 출력한다.
"""
score=int(input("점수를 입력하세요:"))
if score>=90:
    print("A")
elif score>=80:
    print("B")
elif score>=70:
    print("C")
elif score>=60:
    print("D")
else:
    print("F")