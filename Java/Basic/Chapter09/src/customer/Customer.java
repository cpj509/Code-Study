package customer;

public class Customer {
    private int customerID;
    private String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer(){
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public int calcPrice(int price){
        //Bonus Point = 가격 x 보너스 적립율
        bonusPoint = (int)(price*bonusRatio);
        return price;
    }

    public String showInfo(){
        return customerName + "님의 등급은 " + customerGrade +
                "이고, 보너스 포인트는 " + bonusPoint + "점입니다.";
    }

}
