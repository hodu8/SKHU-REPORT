"""
주제 : 분수를 정의하는 fraction 클래스를 정의한다.
특수연산자 구현하여 +, -, ==, <, >, != 결과를 출력,
+, -의 결과를 출력할 때는 __str__가 자동으로 호출되게 프로그래밍한다.
작성일 : 2017.11.05.
작성자 : 박찬우
"""

class fraction: # 분수를 정의하는 fraction 클래스 정의
   def __init__(self, n, d):
       """
       분모와 분자를 초기화
       :param n: 분자(numer)
       :param d: 분모(denom)
       """
       self.numer=n
       self.denom=d

   def __str__(self):
       return str(self.numer)+"/"+str(self.denom) # __str__ 메소드를 이용하여 문자열로 출력

   def __add__(self, a):
       d=self.denom*a.denom # 전달받은 인자들을 계산하여 분모를 d에 저장
       n=self.numer*a.denom+self.denom*a.numer # 전달받은 인자들을 계산하여 분자를 n에 저장
       fadd=fraction(n, d) #  두 분수의 합을 fadd에 저장
       return fadd # fadd에 저장된 값을 반환

   def __sub__(self, a):
       d=self.denom * a.denom  # 전달받은 인자들을 계산하여 분모를 d에 저장
       n=self.numer * a.denom-self.denom * a.numer# 전달받은 인자들을 계산하여 분자를 n에 저장
       fsub=fraction(n, d)  # 두 분수의 차를 fsub에 저장
       return fsub  # fsub에 저장된 값을 반환

   def __eq__(self, a):
       f1=self.numer*a.denom
       f2=self.denom*a.numer
       # 두 분수가 같은지 비교하기 위해 분자와 분모를 X자로 곱해 각각 f1, f2에 저장
       return f1==f2 # 두 분수의 == 연산자 결과 값을 반환

   def __lt__(self, a):
       f1=self.numer*a.denom
       f2=self.denom*a.numer
       # 두 분수의 크기를 비교하기 위해 분자와 분모를 X자로 곱해 각각 f1, f2에 저장
       return f1<f2 # 두 분수의 < 연산자 결과 값을 반환

   def __gt__(self, a):
       f1=self.numer*a.denom
       f2=self.denom*a.numer
       # 두 분수의 크기를 비교하기 위해 분자와 분모를 X자로 곱해 각각 f1, f2에 저장
       return f1>f2 # 두 분수의 > 연산자 결과 값을 반환

   def __ne__(self, a):
       f1=self.numer*a.denom
       f2=self.denom*a.numer
       # 두 분수가 다른지 비교하기 위해 분자와 분모를 X자로 곱해 각각 f1, f2에 저장
       return f1!=f2 # 두 분수의 != 연산자 결과 값을 반환

fa=fraction(2, 4) # 2/4라는 분수를 저장할 변수 fa 선언
fb=fraction(4, 7)  # 4/7이라는 분수를 저장할 변수 fb 선언

print("2/4 + 4/7 =", fa+fb) # 2/4 + 4/7 를 출력
print("2/4 - 4/7 =", fa-fb) # 2/4 - 4/7 를 출력
print("2/4 == 4/7 =", fa==fb) # 2/4 == 4/7 의 결과를 출력
print("2/4 < 4/7 =", fa<fb)  # 2/4 < 4/7 의 결과를 출력
print("2/4 > 4/7 =", fa>fb)  # 2/4 > 4/7 의 결과를 출력
print("2/4 != 4/7 =", fa!=fb) # 2/4 != 4/7 의 결과를 출력