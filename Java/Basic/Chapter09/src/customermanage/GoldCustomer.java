package customermanage;

public class GoldCustomer extends Customer{
    double saleRatio;
    public GoldCustomer(){
        super();
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }
    public GoldCustomer(int customerID, String customerName){
        super(customerID, customerName);
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }
    @Override
    public int calcPrice(int price) {
        price = price - (int)(price*saleRatio);
        bonusPoint += (int)(price*bonusRatio);
        return price;
    }
}
