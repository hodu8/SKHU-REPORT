"""
주제 : 구구단 출력
작성일 : 2017.9.27.
작성자 : 박찬우
"""
for i in range (2, 10):
    print("\n%d단"%(i))
    for j in range (1,10):
        print("%d X %d = %d"%(i, j, i*j))