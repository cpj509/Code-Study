# import travel.thailand # 모듈이나 패키지만 가능


# trip_to = travel.thailand.ThailandPackage()
# trip_to.detail()

# from travel.thailand import ThailandPackage

# trip_to = ThailandPackage()
# trip_to.detail()

# from travel import vietnam

# trip_to = vietnam.VietnamPackage()
# trip_to.detail()
from travel import *

# trip_to = vietnam.VietnamPackage()  # 개발자가 공개 범위를 설정해줘야함
# trip_to = thailand.ThailandPackage()
# trip_to.detail()
import inspect
import random

print(inspect.getfile(random))
print(inspect.getfile(thailand))