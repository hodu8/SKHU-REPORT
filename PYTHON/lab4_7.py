"""
작성자 : 박찬우
작성일 : 2017.9.25.
주제 : for 반복문
"""
l=[1, 3, 5]
for i in range(1, 6, 2):
    print(l)
for i in l:
    print(i)
s="성공회대학교"
for i in s:
    print(i)

#1에서 100까지의 합을 구하여 출력하시오.
sum=0
for i in range(1, 101):
    sum+=i
print("1에서 100까지의 합 = ", sum)

#1에서 100까지 3의 배수의 합을 구하여 출력하시오.
sum=0
for i in range(3, 101, 3):
    sum+=i
print("1에서 100까지 3의 배수의 합 = ", sum)

#또 다른 방법
sum=0
for i in range(99, 0, -3):
    sum+=i
print("1에서 100까지 3의 배수의 합 = ", sum)

#또 다른 방법
sum=0
i=0
while i<=100:
    i+=1
    if (i%3 !=0):
        continue
    else:
        sum +=i
print("1에서 100까지 3의 배수의 합 = ", sum)

#1에서 50까지 합을 while을 이용하여 구하여 출력하시오.
sum=0
i=1
while i<=100:
    sum+=i
    i+=1
    #i가 50이면 break
    if (i==50):
        break
print("1에서 50까지의 합 = ", sum)
