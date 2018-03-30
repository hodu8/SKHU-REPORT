
gawi = '가위'
bawi = '바위'
bo = '보'

win = '이겼다'
draw = '비겼다'
lose = '졌다'


mine = '가위'
yours = '바위'

if mine == yours:
	result = draw
else:
	if mine == gawi:
		if yours == bawi:
			result = lose
		else:
			result = win
	elif mine == bawi:
		if yours == bo:
			result = lose
		else:
				result = win
	elif mine == bo:
		if yours == gawi:
				result == lose
		else:
				result = win
	else:
		print('이상해요')
		
	
print(result)