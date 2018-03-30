S = input()
l = []
for j in range(0, len(S)):
    for i in range(j, len(S)+1):
        l.append(S[j:i])
print(len(set(l))-1)
