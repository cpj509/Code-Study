package chapter08;

public class Dog {
    private String name;
    private String type;

    public Dog(){}

    public Dog(String name, String type){
        setName(name);
        setType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void showInfo(){
        System.out.println(getName() + " " + getType());

    }
}
