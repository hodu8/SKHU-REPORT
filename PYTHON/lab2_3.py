"""
주제 : 문자열 함수
작성일 : 2017.9.6.
작성자 : 박찬우
"""
#문자열 s에 "Test your Python debugging skills!"를 저장한다.
s="   Test your Python debugging skills!   "
#문자열을 모두 소문자로 출력
print(s.lower())
#문자열을 모두 대문자로 출력
print(s.upper())
#문자열에 포함된 t의 개수 출력
print(s.count("t"))
#문자열에0 포함된 T의 개수 출력
print(s.count("T"))
"""
사용자에게서 찾을 문자를 입력 받아서,
대소문자 구분 없이 해당 문자의 개수 출력
"""
word=input("찾을 문자를 입력하세요:")
print("대소문자 구분 없이 해당 문자의 개수=",s.count(word.upper())+s.count(word.lower()))

# t가 있는 위치 출력
print("t가 있는 위치 :",s.index('t'))

# x가 있는 위치 출력
# print("x가 있는 위치 :",s.index('x'))

# s앞에 빈칸 3개, 뒤에 빈칸 3개 추가해서 출력
print(s)

# s의 왼쪽 공백 제거 후 출력
print(s.lstrip())

#s의 오른쪽 공백 제거 후 출력
print(s.rstrip())

#s의 양쪽 공백 제거 후 출력
print(s.strip())

#s를 출력
print(s)

#python에서 문자열은 수정불가의 상태이기 때문에, 수정하려면 통째로 바꾸어서 저장해야 함
s=s.strip()
print(s)

#문장에서 Python을 Java로 바꾸어 출력
print(s.replace("Python","Java"))

#문장에서 e를 i로 모두 바꾸어 출력
print(s.replace("e","i"))

#문장에서 e를 i로 한번만 바꾸어 출력
print(s.replace("e","i",1))

#빈칸을 기준으로 문자열을 전부 나누기
print(s.split(" "))

#빈칸을 기준으로 문자열을 3개만 떼어내기
print(s.split(" ",3))

#문자열 길이 출력
print(len(s))