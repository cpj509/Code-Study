package Constructor;

public class Person {
    String name;
    float height;
    float weight;

    public Person(){
//        System.out.println("Constructor");

    }
    public Person(String na, float hei, float wei){
        name = na;
        height = hei;
        weight = wei;
    }

    public void showInfo(){
        System.out.println("Name : " + name + ", Height : " +
                height + ", Weight : " + weight);
    }
}
