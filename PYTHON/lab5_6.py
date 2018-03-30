"""
주제 : 1. 리스트로 넘어오는 숫자들 중에서 가장 작은 값을 반환하는 min 함수를 정의하라.
       2. 리스트로 넘어오는 숫자들 중에서 가장 큰 값을 반환하는 max 함수를 정의하라.
       3. l 변수에 [4, 7, 9, 11, -5]를 저장한 후, 함수를 호출하여 최소, 최대값을 출력하라.
작성일 : 2017.10.16.
작성자 : 박찬우
"""
def min (minn): #리스트로 넘어오는 숫자들 중에서 최소값을 반환하는 min 함수 정의
    num=minn[0] #num에 리스트로 넘어온 minn(l)의 0번째 요소를 저장
    for i in minn: #minn(l)에 저장된 요소들을 순서대로 i에 넣어서 반복
        if i<num: #만약 i가 num보다 작으면
            num=i #num에 i를 저장
    return num #계속 반복해서 나온 최소값 num을 반환

def max (maxn):
    num=maxn[0]
    for i in maxn:
        if i>num:
            num=i
    return num

l=[4, 7, 9, 11, -5]

print(min(l))
print(max(l))