package polymorphism.downcasting2;

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
    public void readBook(){
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Eagle extends Animal{
    @Override
    public void move(){
        System.out.println("독수리가 하늘을 납니다.");
    }
    public void flying(){
        System.out.println("독수리가 날개를 펴고 멀리 날아갑니다.");
    }
}

class Tiger extends Animal{
    @Override
    public void move(){
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

public class AnimalArray {
    Animal[] aniArray = new Animal[3];

    //객체 생성 메서드
    private void addAnimal(){
        aniArray[0] = new Human();
        aniArray[1] = new Eagle();
        aniArray[2] = new Tiger();
    }
    //다형성 구현 메서드
    public void testCasting(){
        for (int i = 0; i < aniArray.length; i++) {
            if(aniArray[i] instanceof Human){
                Human human = (Human) aniArray[i];
                human.readBook();
            }
            aniArray[i].move();
        }

    }
    public static void main(String[] args) {
        AnimalArray aArray = new AnimalArray();
        aArray.addAnimal();//객체 생성 메서드 호출
        aArray.testCasting();

    }
}