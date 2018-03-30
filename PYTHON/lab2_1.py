"""
주제 : Data Type
작성일 : 2017.9.4.
작성자 : 박찬우
"""
# float형 변수 f에 3.4 저장, 출력
f=3.4 # python 컴파일러가 알아서 float형으로 변환해줌
print("f =",f)
# int형 변수 i에 1을 저장, 출력
i=1
print("i =",i)
# bool형 변수 b에 True를 저장, 출력
b1=True # bool형 변수를 쓸때는 True와 False의 맨 앞글자를 대문자로 써주어야함
print("b1 =",b1)
b2=False
print("b2 =",b2)
# str형 변수 s에 '1'을 저장, 출력
s='1'
print("s =",s)
# f와 i를 더해서 출력
print("f+i =",f+i) # 컴파일러가 float형으로 자동 변환시킴
# s를 int형으로 변환하여 i와 더하여 출력
print("int(s)+i =",int(s)+i)
"""
s=int(s) s가 int형으로 변환됨
print("s+i =",s+i) 결과 = 2
"""
# i를 str형으로 변환하여 s와 더하여 출력
print("s+str(i) =",s+str(i))
# 복소수 k를 정의하여 5+7j 저장
k=5+7j
print("k =",k)
print("k.real =",k.real) # k의 실수 부분만 따옴
print("k.imag =",k.imag) #k의 허수 부분만 따옴
print("켤레 복소수 =",k.conjugate())
# j에 28을 입력
j=28
# i를 j로 나눈 값을 출력
print("i/j =",i/j)
# i에 59를 입력
i=59
# i를 j로 나눈 값의 몫만 출력
print("i//j =",i//j)
# i를 j로 나눈 값의 나머지를 출력
print('i%j =',i%j)
# j의 2제곱 출력
print("j**2= ",j**2)
# j의 3제곱 출력
print("j**3 =",j**3)
# j에 -29저장 후, j의 절대값 출력
j=-29
print("abs(j) =",abs(j))
# b1 or False 출력 ( b1=True )
print("b1 or False =",True or False) # b1이 True였기 때문에 True 출력
# True and b1 출력
print("True and b1 =",True and b1)
# o에 8진수 16대입, 변수 그대로 출력
o=0o16
print("o =%o"%(o))
# x에 16진수 A5대입, 변수 그대로 출력, 16진수로 출력, 10진수로 출력, 8진수로 출력
x=0xA5
print("x =%X"%(x))
print("x =",x)
print("x =%o"%(x))