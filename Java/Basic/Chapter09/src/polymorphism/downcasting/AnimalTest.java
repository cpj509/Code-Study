package polymorphism.downcasting;

import java.util.ArrayList;

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

public class AnimalTest {
    ArrayList<Animal> aniList = new ArrayList<>();

    //객체 생성
    private void addAnimal(){
        aniList.add(new Human());
        aniList.add(new Eagle());
        aniList.add(new Tiger());
    }
    public void testCasting(){
        for (Animal animal:
             aniList) {

            if(animal instanceof Human){
                ((Human) animal).readBook();
                continue;
            }
            animal.move();

        }
    }

    public static void main(String[] args) {
        AnimalTest aTest = new AnimalTest();
        aTest.addAnimal();
        aTest.testCasting();



//        -----------------------------------------------

//        Animal animal1 = new Human();
//        Animal animal2 = new Eagle();
//        Animal animal3 = new Tiger();

        //DownCasting
//        if(animal1 instanceof Human){
//            Human human = (Human)animal1;//object형 -> Human 클래스형으로 형변환
//            human.readBook();
//            human.move();
//        }
//        if(animal2 instanceof Eagle){
//            Eagle eagle = (Eagle)animal2;
//            eagle.flying();
//            eagle.move();
//        }
//        if(animal3 instanceof Tiger){
//            Tiger tiger = (Tiger)animal3;
//            tiger.hunting();
//            tiger.move();
//        }
    }
}