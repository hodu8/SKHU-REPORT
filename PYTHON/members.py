import member

print(member.getinfobyid(member.member,201732004))
print(member.getinfobyname(member.member,"김문수"))

a,b=member.getinfobyid(member.member,201732004)
c,d=member.getinfobyname(member.member,"김문수")
print("{}{}".format(a,b))
print("{}{}".format(c,d))