class Unit:
    def __init__(self):
        print("unit 생성자")


class Flyable:
    def __init__(self):
        print("Flyable 생성자")


class FlyableUnit(Flyable, Unit):
    def __init__(self):
        # super().__init__()  # 다중 상속시 매개 변수의 맨 왼쪽만 호출함.
        Unit.__init__(self)
        Flyable.__init__(self)


dropship = FlyableUnit()