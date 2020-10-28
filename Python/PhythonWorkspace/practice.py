# #quiz1
# station = "사당"
# print(station+"행 열차가 들어오고 있습니다.")

# #quiz2
# from random import *
# x = randrange(4,29)
# print("오프라인 스터디 모임 날짜는 매월", x, "일로 선정되었습니다.")

# #quiz3
# juso = "http://naver.com"
# mystr = juso.replace("http://","")
# mystr = mystr[:mystr.index(".")]
# password = mystr[:3]+str(len(mystr))+str(mystr.count("e"))+"!"
# print("{0}의 비밀번호는 {1}입니다.".format(juso,password))

# #quiz4
# from random import *
# id = list(range(1, 21))
# shuffle(id)
# winner = sample(id,4)
# print("치킨 당첨자 : {}".format(winner[0]))
# print("커피 당첨자 : {}".format(winner[1:]))

# #quiz5
# from random import *
# drivetime = randrange(5,51)
# count = 0
# for i in range(1,51):
#     time = randrange(5,51)
#     if 5 <= time <= 15:
#         print("[O] {}번째 손님 (소요시간 : {}분)".format(i,time))
#         count += 1
#     else:
#         print("[ ] {}번째 손님 (소요시간 : {}분)".format(i,time))
# print ("총 탑승 승객 : "+str(count)+"분")

# #quiz6
# height = 175
# gender = "남자"
# def st_weight(height, gender):
#     if gender == "남자":
#         return height*height*22
#     else:
#         return height*height*21
# print("키 {}cm {}의 표준 체중은 {}kg 입니다".format(height, gender, round(st_weight(height/100, gender),2)))

# # quiz7
# # input으로 입력받을 시 항상 str
# # 내가 작성한 코드, install black and apply auto formatting setting(activate on save)
# num = range(1, 4)
# for i in num:
#     reports = open("{}주차.txt".format(i), 'w', encoding='utf8')
#     print("- {} 주차 주간보고 -".format(i), file=reports)
#     print("부서 :", file=reports)
#     print("이름 :", file=reports)
#     print("업무 요약 :", file=reports)
#     reports.close()
# 정답 코드
# for i in range(1, 51):
#     with open(str(i)+"주차.txt", "w"m encoding="utf8") as report_files:
#         report_file.write("- {0} 주차 주간보고 -".format(i))
#         report_file.write("\n부서 :")
#         report_file.write("\n이름 :")
#         report_file.write("\n업무 요약 :")