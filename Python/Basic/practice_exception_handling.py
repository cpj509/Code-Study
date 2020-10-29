# try:
#     nums = []
#     print("나누기 전용 계산기.")
#     nums.append(int(input("first number : ")))
#     nums.append(int(input("second number : ")))
#     # nums.append(int(nums[0] / nums[1]))
#     print("{} / {} = {}".format(nums[0], nums[1], nums[2]))
# except ValueError:
#     print("invalid value")
# except ZeroDivisionError as err:
#     print(err)
# except Exception as err:
#     print(err)


# class BigNumberError(Exception):
#     def __init__(self, msg):
#         self.msg = msg

#     def __str__(self):
#         return self.msg


# try:
#     print("single number 나누기 전용 calculator")
#     num1 = int(input())
#     num2 = int(input())
#     if num1 >= 10 or num2 >= 10:
#         raise BigNumberError("input number : {}, {}".format(num1, num2))
#     print("{} / {} = {}".format(num1, num2, int(num1 / num2)))
# except ValueError:
#     print("invalid value")
# except BigNumberError as err:
#     print("에러 발생! 한 자리 숫자만 입력하세요.")
#     print(err)
# finally:
#     print("thank for using our service.")