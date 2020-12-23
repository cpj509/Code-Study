package polymorphism;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal{
    @Override //생략 가능, 상속때 메서드 재정의
   public void move(){
        System.out.println("사람이 움직입니다.");
    }
}

class Eagle extends Animal{
    @Override
    public void move(){
        System.out.println("독수리가 하늘을 납니다.");
    }
}

class Tiger extends Animal{
    @Override
    public void move(){
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
}

public class AnimalTest {
    //다형성을 구현한 메서드
    public void moveAnimal(Animal animal){
        animal.move();
    }
    public static void main(String[] args) {
        AnimalTest aTest = new AnimalTest();
        Animal human = new Human();//자동 형변환(묵시적 형변환)(부모 > 자식)
        Animal eagle = new Eagle();
        Animal tiger = new Tiger();

        aTest.moveAnimal(human);
        aTest.moveAnimal(eagle);
        aTest.moveAnimal(tiger);
    }
}