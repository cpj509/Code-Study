from random import *

# 일반 유닛
class Unit:
    def __init__(self, name, hp, speed):
        self.name = name
        self.hp = hp
        self.speed = speed
        print("{} 유닛이 생성되었습니다.".format(name))

    def move(self, location):
        print("{} : {} 방향으로 이동합니다. [속도 {}]".format(self.name, location, self.speed))

    def damaged(self, damage):
        print("{} : {} 데미지를 입었습니다.".format(self.name, damage))
        self.hp -= damage
        if self.hp <= 0:
            print(("{} : 파괴되었습니다.".format(self.name)))


# 공격 유닛
class AttackUnit(Unit):
    def __init__(self, name, hp, speed, damage):
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


# 마린
class Marine(AttackUnit):
    def __init__(self):
        AttackUnit.__init__(self, "마린", 40, 1, 5)

    # 스팀팩: 일정 시간 동안 이동 및 공격 속도를 증가, 자기 체력 10 감소
    def stimpack(self):
        if self.hp > 10:
            self.hp -= 10
            print("{} : 스팀팩을 사용합니다. HP 10 감소".format(self.name))
        else:
            print("{} : 체력이 부족합니다.".format(self.name))


# 탱크
class Tank(AttackUnit):
    seize_developed = False

    def __init__(self):
        AttackUnit.__init__(self, "탱크", 150, 1, 35)
        self.seize_mode = False

    # 시즈모드: 탱크를 지상에 곶어시켜, 더 높은 파워로 공격 가능. 이동 불가.
    def set_seize_mode(self):
        if Tank.seize_developed == False:
            return

        # 현재 시즈모드가 아닐 때 -> 시즈모드
        if self.seize_mode == False:
            print("{} : 시즈 모드로 전환합니다.".format(self.name))
            self.damage *= 2
            self.seize_mode = True
        # 현재 시즈모드일 때 -> 시즈모드 해제
        else:
            print("{} : 시즈 모드를 해제합니다.".format(self.name))
            self.damage /= 2
            self.seize_mode = False

    # 스팀팩: 일정 시간 동안 이동 및 공격 속도를 증가, 자기 체력 10 감소
    def stimpack(self):
        if self.hp > 10:
            self.hp -= 10
            print("{} : 스팀팩을 사용합니다. HP 10 감소".format(self.name))
        else:
            print("{} : 체력이 부족합니다.".format(self.name))


# 비행 기능
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
        self.fly(self.name, location)


# 레이스
class Wraith(FlyableAttackUnit):
    def __init__(self):
        super().__init__("레이스", 80, 20, 5)
        self.clocked = False

    def clocking(self):
        if self.clocked == True:
            print("{} : 클로킹 모드 해제합니다.".format(format(self.name)))
            self.clocked == False
        else:
            print("{} : 클로킹 모드 작동합니다.".format(format(self.name)))
            self.clocked == True


def game_start():
    print("새로운 게임을 시작합니다.")


def game_over():
    print("player : gg")
    print("[player] 님이 게임에서 퇴장하셨습니다.")


# 실제 게임 진행
game_start()

m1 = Marine()
m2 = Marine()
m3 = Marine()

t1 = Tank()
t2 = Tank()

w1 = Wraith()

# 유닛 일괄 관리
attack_units = []
attack_units.append(m1)
attack_units.append(m2)
attack_units.append(m3)
attack_units.append(t1)
attack_units.append(t2)
attack_units.append(w1)

# 전군 이동
for unit in attack_units:
    unit.move("1시")

# 탱크 시즈모드 개발
Tank.seize_developed = True
print("탱크 시즈 모드 개발이 완료되었습니다.")

# 공격 모드 준비(마린:스팀팩, 탱크:시즈모드, 레이스:클로킹)
for unit in attack_units:
    if isinstance(unit, Marine):
        unit.stimpack()
    elif isinstance(unit, Tank):
        unit.set_seize_mode()
    elif isinstance(unit, Wraith):
        unit.clocking()

# 전군 공격
for unit in attack_units:
    unit.attack("1시")

# 전군 피해
for unit in attack_units:
    unit.damaged(randint(5, 21))  # 5~20의 데미지를 받음

# 게임 종료
game_over()