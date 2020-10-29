# #study python class
# name = "Marine"
# hp = 40
# damage = 5

# print("{0} unit creates.".format(name))
# print("hp {0}, Damage {1}\m".format(hp, damage))

# tank_name = "Tank"
# tank_hp = 40
# tank_damage = 5

# print("{0} unit creates.".format(tank_name))
# print("hp {0}, damage {1}\m".format(tank_hp, tank_damage))

# def attack(name, location, damage):
#     print("{0} : attack the enemys at {1}. [Damage {2}]".format(name, location, damage))

# attack(name, "1 o'clock", damage)
# attack(tank_name, "1 o'clock", tank_damage)

# general unit
class Unit:  # 부모 클래스
    def __init__(self, name, hp, speed):
        self.name = name
        self.hp = hp
        self.speed = speed
        # self.damage = damage
        # print("{0} unit is created.".format(self.name))
        # print("hp {}, dammage {}".format(self.hp, self.damage))

    def move(self, location):
        print("[지상 유닛 이동]")
        print("{} : {} 방향으로 이동합니다. [속도 {}]".format(self.name, location, self.speed))


# marine1 = Unit("marine", 40, 5)#class instance
# marine2 = Unit("marine", 40, 5)
# tank = Unit("tank", 150, 35)

# attack unit
class AttackUnit(Unit):  # 자식 클래스
    def __init__(self, name, hp, speed, damage):
        # self.name = name
        # self.hp = hp
        Unit.__init__(self, name, hp, speed)
        self.damage = damage

    def attack(self, location):
        print(
            "{} : {} 방향으로 적군을 공격 합니다.[공격력 {}]".format(self.name, location, self.damage)
        )

    def damaged(self, damage):
        print("{} : {} 데미지를 입었습니다.".format(self.name, damage))
        self.hp -= damage
        if self.hp <= 0:
            print(("{} : 파괴되었습니다.".format(self.name)))


# #firebat, attack unit, flamethrower
# firebat1 = AttackUnit("firebat", 50, 16)
# firebat1.attack("5시")

# # firebat attacked by enemy
# firebat1.damaged(25)
# firebat1.damaged(25)


class Flyable:
    def __init__(self, flying_speed):
        self.flying_speed = flying_speed

    def fly(self, name, location):
        print(
            "{} : {} 방향으로 날아갑니다. [speed {}]".format(name, location, self.flying_speed)
        )


# 공중 공격 유닛 클래스
class FlyableAttackUnit(AttackUnit, Flyable):
    def __init__(self, name, hp, damage, flying_speed):
        AttackUnit.__init__(self, name, hp, 0, damage)  # land speed 0
        Flyable.__init__(self, flying_speed)

    def move(self, location):
        print("[공중 유닛 이동]")
        self.fly(self.name, location)


# # valkyrie : flying attack unit, shoot 14 missiles at once.
# valkyrie = FlyableAttackUnit("발키리", 200, 6, 5)
# valkyrie.fly(valkyrie.name, "3시")

# vulture = AttackUnit("벌쳐", 80, 10, 20)
# battlecruiser = FlyableAttackUnit("배틀크루저", 500, 25, 3)
# vulture.move("12시")
# # battlecruiser.fly(battlecruiser.name, "9시")
# battlecruiser.move("9시")

# # 건물
# class BuildingUnit(Unit):
#     def __init__(self, name, hp, location):
#         # pass  # 아무것도 안하고 그냥 넘어감
#         # Unit.__init__(self, name, hp, 0)
#         super().__init__(name, hp, 0)
#         self.location = location


# supply_depot = BuildingUnit("서플라이 디폿", 500, "7시")


# def game_start():
#     print("game start!")

# def game_over():
#     pass

# game_start()
# game_over()