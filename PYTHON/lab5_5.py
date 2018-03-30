"""
주제 : 1. a에는 5, b에는 자신의 이름, c에는 3.14, d에는 True를 배정한다.
       2. 각 변수의 타입과 값을 출력한다.
       3. value_type이라는 함수를 정의하여, 매개변수로 넘어온 변수의 값과
       타입을 문자열로 반환한다.
       아래와 같이 출력되도록 한다.
       a: 값은 5, 타입은 <class 'int'>
       b: 값은 김일수, 타입은 <class 'str'>
       c: 값은 3.14, 타입은 <class 'float'>
       d: 값은 True, 타입은 <class 'bool'>
작성일 : 2017.10.16.
작성자 : 박찬우
"""


def value_type(data, type):
    return "값은 "+str(data)+" 타입은 "+str(type)

a=5
b='박찬우'
c=3.14
d=True

print("a:",value_type(a,type(a)))
print("b:",value_type(b,type(b)))
print("c:",value_type(c,type(c)))
print("d:",value_type(d,type(d)))