"""
주제 : 데이터를 파일에서 읽어 들여서 전체 평균, 각 학생의 평균 점수, 각 과목당 평균 점수를 출력
작성일 : 2017.12.07.
작성자 : 박찬우
"""
try:  # 예외처리를 위한 try 문법 선언
    s = open("score.txt", "r")  # 변수 s에 score.txt를 읽기모드로 읽은것을 저장
    l = s.readlines()  # 변수 l에 score.txt의 내용을 한꺼번에 저장
    var1 = []  # 빈 리스트인 var1 선언
    var2 = []  # 빈 리스트인 var2 선언
    name = []  # 이름들을 저장할 리스트 name 선언
    kor = []  # 국어 점수들을 저장할 리스트 kor 선언
    eng = []  # 영어 점수들을 저장할 리스트 eng 선언
    math = []  # 수학 점수들을 저장할 리스트 math 선언
    avg = 0  # 전체 평균을 저장할 변수 avg(average) 선언
    savg = []  # 각 학생의 평균 점수를 저장할 리스트 savg(students average) 선언
    kavg = 0  # 국어 평균 점수를 저장할 변수 kavg(korean average) 선언
    eavg = 0  # 영어 평균 점수를 저장할 변수 eavg(english average) 선언
    mavg = 0  # 수학 평균 점수를 저장할 변수 mavg(math average) 선언
    for i in l:
        var1 += i.split(":")
        # var1에 score.txt의 내용을 :으로 구분하여 저장
    for i in range(0, len(var1)):
        var2.append(var1[i].strip())
        # var2에 var1의 요소들을 앞뒤 필요 없는 문자를 제거하여 저장
    for i in range(0, len(var2)):
        if i % 4 == 0 or i == 0:
            name.append(var2[i])
            # 만약 i를 4로 나눈값이 0이거나 i가 0이라면 name에 var2의 i번째 요소를 저장
        elif i % 4 == 1:
            kor.append(int(var2[i]))
            # 만약 i를 4로 나눈값이 1이면 kor에 var2의 i번째 요소를 정수 형태로 저장
        elif i % 4 == 2:
            eng.append(int(var2[i]))
            # 만약 i를 4로 나눈값이 2이면 kor에 var2의 i번째 요소를 정수 형태로 저장
        else:
            math.append(int(var2[i]))
            # 모두 만족하지 않는다면 math에 var2의 i번째 요소를 정수 형태로 저장
    for i in range(0, len(name)):
        savg.append((int(kor[i])+int(eng[i])+int(math[i]))/3)
        # savg에 각 학생의 평균 점수를 계산한 값을 저장
    for i in range(0, len(savg)):
        avg += savg[i]/len(savg)
        # avg에 전체 평균을 계산한 값을 저장
    print("==== 전체평균 ====\n"+str(avg))  # 전체평균 출력
    print("==== 각 학생 평균 ====")
    for i in range(0, len(name)):
        print("%s %.1f" % (name[i], savg[i]))  # 각 학생의 평균 출력
        kavg += kor[i]  # kavg에 kor의 i번째 요소들을 더해서 저장
        eavg += eng[i]  # eavg에 eng의 i번째 요소들을 더해서 저장
        mavg += math[i]  # mavg에 math의 i번째 요소들을 더해서 저장
    print("==== 각 과목 평균 ====")
    print("국어 평균: %.1f" % (kavg/len(kor)))
    print("영어 평균: %.1f" % (eavg/len(eng)))
    print("수학 평균: %.1f" % (mavg/len(math)))
    # 각 과목의 평균 출력
except FileNotFoundError:
    print("파일이 존재하지 않습니다.")
    # 만약 현재 디렉토리에 score.txt 파일이 없다면 출력
