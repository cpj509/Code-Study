# Say "Hello, World!" With Python


# print("Hello, World!")

# Arithmetic Operators


# if __name__ == "__main__":
#     a = int(input())
#     b = int(input())
#     print(a + b)
#     print(a - b)
#     print(a * b)

# Python: Division


# if __name__ == '__main__':
#     a = int(input())
#     b = int(input())
#     print(a//b)
#     print(a/b)

# Loops


# if __name__ == '__main__':
#     n = int(input())
#     i = 1
#     j = 0
#     a = 0
#     while j < n:
#         print(a)
#         a += i
#         i += 2
#         j += 1

# Write a function


# def is_leap(year):
#     leap = False

#     # Write your logic here
#     if (year % 4 ==0 and year % 100 != 0) or year % 400 == 0:
#         leap = True
#     return leap

# Print Function

# if __name__ == "__main__":
#     n = int(input())
#     for i in range(1, n + 1):
#         print(i, end="")
# Python If-Else

#!/bin/python3

import math
import os
import random
import re
import sys


if __name__ == "__main__":
    n = int(input().strip())
    if n % 2 == 1:
        print("Weird")
    else:
        if 6 <= n <= 20:
            print("Weird")
        else:
            print("Not Weird")
