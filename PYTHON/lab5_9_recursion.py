"""
주제 : 피보나치 수열 recursion 함수 사용하기
작성일 : 2017.10.23.
작성자 : 박찬우
"""
def fibo_recursion(n): #n을 매개변수로 받는 재귀함수 fibo_recursion 정의
    if n < 1 or n == 1: #만약 n이 1보다 작거나 같으면
        return n #n을 반환
    return fibo_recursion(n-1) + fibo_recursion(n-2) #n에서 1을 뺀 값과 2를 뺀 값을 호출해 더한 뒤, 반환

print(fibo_recursion(10)) #fibo_recursion에 10을 보내 호출한 다음 피보나치 수열의 10번째 값을 출력