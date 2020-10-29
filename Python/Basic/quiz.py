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

# # quiz_class
# (출력 예제)
# 총 3대의 매물이 있습니다.
# 강남 아파트 매매 10억 2010년
# 마포 오피스텔 전세 5억 2007년
# 송파 빌라 월세 500/50 2000년
# #my code
# class House:
#     # 매물 초기화
#     def __init__(self, location, house_type, deal_type, price, completion_year):
#         self.location = location
#         self.house_type = house_type
#         self.deal_type = deal_type
#         self.price = price
#         self.completion_year = completion_year

#     # 매물 정보 표시
#     def show_detail(self):
#         print(
#             self.location,
#             self.house_type,
#             self.deal_type,
#             self.price,
#             self.completion_year,
#         )


# a = House("강남", "아파트", "매매", "10억", "2010년")
# b = House("마포", "오피스텔", "전세", "5억", "2007년")
# c = House("송파", "빌라", "빌라", "500/50", "2000년")

# housedetail = []
# housedetail.append(a)
# housedetail.append(b)
# housedetail.append(c)
# print("총 {}대의 매물이 있습니다.".format(len(housedetail)))
# for house in housedetail:
#     house.show_detail()

# # quiz_exception handling
# class SoldOutError(Exception):
#     pass


# chicken = 10
# waiting = 1
# while True:
#     try:
#         print("[남은 치킨 : {}".format(chicken))
#         if chicken == 0:
#             raise SoldOutError
#         order = int(input("How many chickens would you like to order? : "))
#         elif order < 1:
#             raise ValueError
#         if order > chicken:  # chicken order is bigger than you have chicken
#             print("치킨이 부족합니다")
#         else:
#             print("[대기 번호 {}] {} 마리 주문이 완료되었습니다.".format(waiting, order))
#             waiting += 1
#             chicken -= order
#     except ValueError:
#         print("잘못된 값을 입력하였습니다.")
#         break
#     except SoldOutError:
#         print("재고가 소진되어 더 이상 주문을 받지 않습니다.")
#         break

# # quiz 10
# import byme

# byme.sign()