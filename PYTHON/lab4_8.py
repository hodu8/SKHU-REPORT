"""
주제 : for 반복문
작성일 : 2017.9.25.
작성자 : 홍은지
"""
"""
1. 사용자로부터 입력 받은 수의 모든 약수 구하기
2. 1부터 사용자로부터 입력 받은 수까지
   각각의 모든 약수 구하여 리스트 형태로 출력
"""
n=int(input("숫자를 하나 입력하세요 :"))
i=0
l=[]
while i<=n-1:
    i+=1
    if (n%i !=0):
        continue
    else:
        l.append(i)
print(l)