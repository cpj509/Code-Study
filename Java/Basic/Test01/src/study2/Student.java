package study2;

public class Student {
    public String studentName;
    public int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void take(Vehicle vehicle){
        if(vehicle instanceof Bus){
            this.money -= 1000;
            vehicle.carry(1000);
        }
        if(vehicle instanceof Taxi){
            this.money -= 1200;
            vehicle.carry(1200);
        }
        if(vehicle instanceof Subway) {
            this.money -= 1400;
            vehicle.carry(1400);
        }
        System.out.println(vehicle.getVehicleName() + "에 탑승합니다.");
    }

    public void showInfo(){
        System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
    }
}
