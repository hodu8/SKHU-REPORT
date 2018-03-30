"""
주제 : 사용자가 입력한 영문자를 아래와 같이 출력
작성일 : 2017. 9. 27.
작성자 : 박찬우
"""
s=input("영문자를 입력하세요 : ")
len=len(s)
for i in range(0, len):
    print(" "*i+s[i:len])