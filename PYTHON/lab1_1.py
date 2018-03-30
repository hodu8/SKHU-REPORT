name=input("이름:")
age=int(input("나이:"))
height=float(input("키:"))

print("나의 이름은",name,"입니다.\n""나의 나이는",age,"입니다.\n""나의 키는",height,"입니다.\n")# + = 더하기

message="나의 이름은 %s이고, 나이는 %d, 키는 %.1f입니다."
print(message%(name, age, height))
