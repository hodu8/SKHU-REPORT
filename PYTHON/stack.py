stack = []
n = int(input())
for i in range(0, n):
    command = input()
    if command[0:4] == 'push':
        stack.append(int(command[5:]))
    elif command == 'pop':
        if len(stack) == 0:
            print("-1")
            continue
        else:
            print(stack[len(stack)-1])
        del stack[len(stack)-1]
    elif command == 'size':
        print(len(stack))
    elif command == 'empty':
        if len(stack) == 0:
            print("1")
        else:
            print("0")
    elif command == 'top':
        if len(stack) == 0:
            print("-1")
        else:
            print(stack[len(stack)-1])