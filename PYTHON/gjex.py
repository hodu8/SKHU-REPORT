scale = input()
s = scale.split(" ")
result=""
print(s)
if len(s) > 1:
    for i in range(1, len(s)):
        if int(s[i]) < int(s[i-1]):
            result = "descending"
        elif int(s[i]) > int(s[i-1]):
            result = "ascending"
        if i == len(s)-1:
            break
        elif (int(s[i-1]) > int(s[i]) and int(s[i]) < int(s[i+1])) or (int(s[i-1]) < int(s[i]) and int(s[i]) > int(s[i+1])):
            result = "mixed"
            break
    print(result)
else:
    print("single")
