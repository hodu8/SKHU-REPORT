"""
주제 : 조건문 연습
작성일 : 2017.9.20.
작성자 : 박찬우
"""
"""
사용자로부터 2개의 정수를 입력받는다.
어떤 순서로 두 수가 들어오든 상관없이,
두 수의 차이와 절대값을 출력한다.
"""
num1=int(input("정수를 입력하세요:"))
num2=int(input("정수를 입력하세요:"))

if num1>=num2:
    print("두 수의 차이의 절대값=", num1-num2)
else:
    print("두 수의 차이의 절대값=", num2-num1)